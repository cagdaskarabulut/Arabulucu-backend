package com.karabulut.arabulucubackend;

import com.karabulut.arabulucubackend.User.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ArabulucuBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArabulucuBackendApplication.class, args);
	}

	@Bean
	@Profile("dev")
	CommandLineRunner createInitialUsers(UserService userService, HoaxService hoaxService) {
		return (args) -> {
			try {
				userService.getByUsername("user1");
			} catch (Exception e) {
				for(int i = 1; i<=25;i++) {
					User user = new User();
					user.setUsername("user"+i);
					user.setDisplayName("display"+i);
					user.setPassword("P4ssword");
					userService.save(user);
					for(int j = 1;j<=20;j++) {
						HoaxSubmitVM hoax = new HoaxSubmitVM();
						hoax.setContent("hoax (" +j + ") from user ("+i+")");
						hoaxService.save(hoax, user);
					}
				}
			}
		};
	}
}

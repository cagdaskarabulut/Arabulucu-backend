package com.karabulut.arabulucubackend.controller;

import com.karabulut.arabulucubackend.dto.ArticleDto;
import com.karabulut.arabulucubackend.dto.common.BaseResponse;
import com.karabulut.arabulucubackend.enums.common.MessageCode;
import com.karabulut.arabulucubackend.service.ArticleService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Tag(name = "article", description = "This endpoints contain article APIs user details.")
@RequestMapping(value = "/article")
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleService service;

    @GetMapping("/{id}")
    public BaseResponse<ArticleDto> getById(@PathVariable Long id){
        return BaseResponse.<ArticleDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getById(id))
                .build();
    }

    @GetMapping
    public BaseResponse<List<ArticleDto>> getAll(){
        return BaseResponse.<List<ArticleDto>>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.getAll())
                .build();
    }

    @PostMapping
    public BaseResponse<ArticleDto> save(@RequestBody ArticleDto articleDto){
        return BaseResponse.<ArticleDto>builder()
                .messageCore(MessageCode.SUCCESS)
                .payload(service.save(articleDto))
                .message(MessageCode.SUCCESS.getMessageKey())
                .build();
    }

    @DeleteMapping("/{articleId}")
    public BaseResponse<Void> delete(@PathVariable Long articleId){
        service.delete(articleId);
        return BaseResponse.<Void>builder()
                .messageCore(MessageCode.SUCCESS)
                .message(MessageCode.SUCCESS.getMessageKey())
                .id(articleId)
                .build();
    }
}

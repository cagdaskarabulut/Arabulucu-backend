package com.karabulut.arabulucubackend.service.impl;

import com.karabulut.arabulucubackend.dto.JobDto;
import com.karabulut.arabulucubackend.mapper.JobMapper;
import com.karabulut.arabulucubackend.model.Job;
import com.karabulut.arabulucubackend.repository.JobRepository;
import com.karabulut.arabulucubackend.service.JobService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class JobServiceImpl implements JobService{
    private final JobRepository repository;
    private final JobMapper mapper;

    @Override
    public JobDto save(JobDto jobDto) {
        Job jobToSave = mapper.toJob(jobDto);
        Job savedJob = repository.save(jobToSave);
        return mapper.toJobDto(savedJob);
    }

    @Override
    public boolean delete(Long id) {
        try {
            repository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public JobDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toJobDto(found.get());
    }

    @Override
    public List<JobDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toJobDtoList((List<Job>) foundList);
    }
}

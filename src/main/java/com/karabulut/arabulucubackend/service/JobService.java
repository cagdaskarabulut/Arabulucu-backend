package com.karabulut.arabulucubackend.service;

import com.karabulut.arabulucubackend.dto.JobDto;

import java.util.List;

public interface JobService {
    JobDto save(JobDto jobDto);
    boolean delete(Long id);
    JobDto getById(Long id);
    List<JobDto> getAll();
}

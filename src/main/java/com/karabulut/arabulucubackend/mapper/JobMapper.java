package com.karabulut.arabulucubackend.mapper;

import com.karabulut.arabulucubackend.dto.JobDto;
import com.karabulut.arabulucubackend.model.Job;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface JobMapper {
    Job toJob(JobDto jobDto);
    JobDto toJobDto(Job job);
    List<JobDto> toJobDtoList(List<Job> job);
}

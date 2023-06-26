package com.karabulut.arabulucubackend.service;

import com.karabulut.arabulucubackend.dto.ArticleDto;

import java.util.List;

public interface ArticleService {
    ArticleDto save(ArticleDto articleDto);
    boolean delete(Long id);
    ArticleDto getById(Long id);
    List<ArticleDto> getAll();
}

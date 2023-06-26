package com.karabulut.arabulucubackend.service.impl;

import com.karabulut.arabulucubackend.dto.ArticleDto;
import com.karabulut.arabulucubackend.mapper.ArticleMapper;
import com.karabulut.arabulucubackend.model.Article;
import com.karabulut.arabulucubackend.repository.ArticleRepository;
import com.karabulut.arabulucubackend.service.ArticleService;
import lombok.RequiredArgsConstructor;
import lombok.var;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepository repository;
    private final ArticleMapper mapper;

    @Override
    public ArticleDto save(ArticleDto articleDto) {
        Article articleToSave = mapper.toArticle(articleDto);
        Article savedArticle = repository.save(articleToSave);
        return mapper.toArticleDto(savedArticle);
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
    public ArticleDto getById(Long id) {
        var found = repository.findById(id);
        return mapper.toArticleDto(found.get());
    }

    @Override
    public List<ArticleDto> getAll() {
        var foundList = repository.findAll();
        return mapper.toArticleDtoList((List<Article>) foundList);
    }

}

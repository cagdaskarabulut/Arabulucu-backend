package com.karabulut.arabulucubackend.mapper;

import com.karabulut.arabulucubackend.dto.ArticleDto;
import com.karabulut.arabulucubackend.model.Article;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    Article toArticle(ArticleDto articleDto);
    ArticleDto toArticleDto(Article article);
    List<ArticleDto> toArticleDtoList(List<Article> article);
}

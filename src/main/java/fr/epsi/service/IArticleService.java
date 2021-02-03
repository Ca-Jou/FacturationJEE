package fr.epsi.service;

import fr.epsi.dto.ArticleDto;
import fr.epsi.entite.Article;

import java.util.List;

public interface IArticleService {
    List<Article> findAllArticles();
    void create(ArticleDto articleDto);
}

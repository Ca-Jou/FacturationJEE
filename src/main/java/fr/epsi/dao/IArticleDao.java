package fr.epsi.dao;

import fr.epsi.entite.Article;

import java.util.List;

public interface IArticleDao {
    List<Article> findAll();
    void create(Article article);
}

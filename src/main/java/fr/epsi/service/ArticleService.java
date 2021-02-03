package fr.epsi.service;

import fr.epsi.dao.ArticleDao;
import fr.epsi.dao.IArticleDao;
import fr.epsi.dto.ArticleDto;
import fr.epsi.entite.Article;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ArticleService implements IArticleService {

    @EJB
    IArticleDao articleDao = new ArticleDao();

    @Override
    public List<Article> findAllArticles() {
        List<Article> articles = this.articleDao.findAll();
        return articles;
    }

    @Override
    public void create(ArticleDto articleDto) {
        Article article = new Article();
        article.setCode(articleDto.getCode());
        article.setNom(articleDto.getNom());
        article.setPrix(articleDto.getPrix());

        this.articleDao.create(article);
    }
}

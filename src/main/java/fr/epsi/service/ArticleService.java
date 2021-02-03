package fr.epsi.service;

import fr.epsi.dto.ArticleDto;
import fr.epsi.dto.ClientDto;
import fr.epsi.entite.Article;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ArticleService implements IArticleService {

    @PersistenceContext(unitName = "pezzzPU")
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    @Override
    public List<Article> findAllArticles() {
        List<Article> articles = entityManager.createQuery("Select a from Article a").getResultList();
        return articles;
    }

    @Override
    public void create(ArticleDto articleDto) {
        Article article = new Article();
        article.setCode(articleDto.getCode());
        article.setNom(articleDto.getNom());
        article.setPrix(articleDto.getPrix());

        try{
            userTransaction.begin();
            entityManager.persist(article);
            userTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

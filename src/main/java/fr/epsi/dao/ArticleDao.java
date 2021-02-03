package fr.epsi.dao;

import fr.epsi.dto.ArticleDto;
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
public class ArticleDao implements IArticleDao {
    @PersistenceContext(unitName = "pezzzPU")
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    public List<Article> findAll() {
        List<Article> articles = entityManager.createQuery("Select a from Article a").getResultList();
        return articles;
    }

    public void create(Article article) {
        try{
            userTransaction.begin();
            entityManager.persist(article);
            userTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}

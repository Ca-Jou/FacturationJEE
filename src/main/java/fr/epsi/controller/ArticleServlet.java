package fr.epsi.controller;

import fr.epsi.entite.Article;
import fr.epsi.service.IArticleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ArticleServlet", value = "/articles")
public class ArticleServlet extends HttpServlet {

    @EJB
    private IArticleService articleService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Article> articles = this.articleService.findAllArticles();
        request.setAttribute("articles", articles);

        this.getServletContext().getRequestDispatcher("/pages/articles.jsp").forward(request, response);
    }
}

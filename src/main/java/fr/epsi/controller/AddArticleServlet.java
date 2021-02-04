package fr.epsi.controller;

import fr.epsi.dto.ArticleDto;
import fr.epsi.service.IArticleService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddArticleServlet", value = "/nouvelarticle")
public class AddArticleServlet extends HttpServlet {

    @EJB
    private IArticleService articleService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/pages/formarticle.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArticleDto articleDTO = new ArticleDto();
        articleDTO.setCode(request.getParameter("code"));
        articleDTO.setNom(request.getParameter("nom"));
        articleDTO.setPrix(Double.parseDouble(request.getParameter("prix")));
        articleService.create(articleDTO);

        this.getServletContext().getRequestDispatcher("/pages/validation.jsp").forward(request, response);
    }
}

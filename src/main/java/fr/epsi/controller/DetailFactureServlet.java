package fr.epsi.controller;

import fr.epsi.entite.Facture;
import fr.epsi.service.IFactureService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "DetailFactureServlet", value = "/facture")
public class DetailFactureServlet extends HttpServlet {

    @EJB
    private IFactureService factureService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Long id = Long.parseLong(request.getParameter("id"));

        Facture facture = this.factureService.findOneById(id);
        request.setAttribute("facture", facture);

        this.getServletContext().getRequestDispatcher("/pages/facture.jsp").forward(request, response);
    }
}

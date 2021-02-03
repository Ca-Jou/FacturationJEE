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

@WebServlet(name = "FactureServlet", value = "/factures")
public class FactureServlet extends HttpServlet {

    @EJB
    private IFactureService factureService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Facture> factures = this.factureService.findAllFactures();
        request.setAttribute("factures", factures);

        this.getServletContext().getRequestDispatcher("/pages/factures.jsp").forward(request, response);
    }
}

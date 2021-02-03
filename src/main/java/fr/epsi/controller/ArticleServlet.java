package fr.epsi.controller;

import fr.epsi.entite.Client;
import fr.epsi.service.IClientService;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClientServlet", value = "/clients")
public class ArticleServlet extends HttpServlet {

    @EJB
    private IClientService clientService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> clients = this.clientService.findAllClients();
        request.setAttribute("clients", clients);

        this.getServletContext().getRequestDispatcher("/pages/clients.jsp").forward(request, response);
    }
}

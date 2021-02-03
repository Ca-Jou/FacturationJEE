package fr.epsi.controller;

import fr.epsi.entite.Client;
import fr.epsi.service.IClientService;

import javax.ejb.EJB;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ClientServlet", value = "/clients")
public class ClientServlet extends HttpServlet {

    @EJB
    private IClientService clientService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Client> clients = this.clientService.findAllClients();
        request.setAttribute("clients", clients);

        this.getServletContext().getRequestDispatcher("/pages/clients.jsp").forward(request, response);
    }
}

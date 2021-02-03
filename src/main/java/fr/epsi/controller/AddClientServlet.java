package fr.epsi.controller;

import fr.epsi.dto.ClientDto;
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

@WebServlet(name = "AddClientServlet", value = "/nouveauclient")
public class AddClientServlet extends HttpServlet {

    @EJB
    private IClientService clientService;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/pages/formclient.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClientDto clientDTO = new ClientDto();
        clientDTO.setNom(request.getParameter("nom"));
        clientDTO.setAdresse(request.getParameter("adresse"));
        clientService.create(clientDTO);

        this.getServletContext().getRequestDispatcher("/pages/validation.jsp").forward(request, response);
    }
}

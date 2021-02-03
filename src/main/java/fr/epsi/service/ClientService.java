package fr.epsi.service;

import fr.epsi.dao.ClientDao;
import fr.epsi.dao.IClientDao;
import fr.epsi.dto.ClientDto;
import fr.epsi.entite.Client;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class ClientService implements IClientService {

    @EJB
    IClientDao clientDao = new ClientDao();

    @Override
    public List<Client> findAllClients() {
        List<Client> clients = this.clientDao.findAll();
        return clients;
    }

    @Override
    public void create(ClientDto clientDto) {
        Client client = new Client();
        client.setNom(clientDto.getNom());
        client.setAdresse(clientDto.getAdresse());

        this.clientDao.create(client);
    }
}

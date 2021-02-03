package fr.epsi.service;

import fr.epsi.dto.ClientDto;
import fr.epsi.entite.Client;

import java.util.List;

public interface IClientService {
    List<Client> findAllClients();
    void create(ClientDto clientDto);
}

package fr.epsi.dao;

import fr.epsi.entite.Client;

import java.util.List;

public interface IClientDao {
    List<Client> findAll();
    void create(Client client);
}

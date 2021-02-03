package fr.epsi.service;

import fr.epsi.dto.ClientDto;
import fr.epsi.entite.Client;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.UserTransaction;
import java.util.List;

@Stateless
@TransactionManagement(TransactionManagementType.BEAN)
public class ClientService implements IClientService {

    @PersistenceContext(unitName = "pezzzPU")
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    @Override
    public List<Client> findAllClients() {
        List<Client> clients = entityManager.createQuery("Select c from Client c").getResultList();
        return clients;
    }

    @Override
    public void create(ClientDto clientDto) {
        Client client = new Client();
        client.setNom(clientDto.getNom());
        client.setAdresse(clientDto.getAdresse());

        try{
            userTransaction.begin();
            entityManager.persist(client);
            userTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

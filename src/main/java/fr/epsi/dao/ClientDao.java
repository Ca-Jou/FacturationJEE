package fr.epsi.dao;

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
public class ClientDao implements IClientDao {
    @PersistenceContext(unitName = "pezzzPU")
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;


    @Override
    public List<Client> findAll() {
        List<Client> clients = entityManager.createQuery("Select c from Client c").getResultList();
        return clients;
    }

    @Override
    public void create(Client client) {
        try{
            userTransaction.begin();
            entityManager.persist(client);
            userTransaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

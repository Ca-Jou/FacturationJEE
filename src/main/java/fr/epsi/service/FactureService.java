package fr.epsi.service;

import fr.epsi.entite.Facture;
import fr.epsi.entite.LigneFacture;

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
public class FactureService implements IFactureService {

    @PersistenceContext(unitName = "pezzzPU")
    EntityManager entityManager;

    @Resource
    UserTransaction userTransaction;

    @Override
    public List<Facture> findAllFactures() {
        List<Facture> factures = entityManager.createQuery("Select f from Facture f order by f.date asc").getResultList();
        return factures;
    }

    @Override
    public Facture findOneById(Long id) {
        List<LigneFacture> lignes = entityManager.createQuery("Select l from LigneFacture l where l.facture.id = :id")
                .setParameter("id", id)
                .getResultList();
        Facture facture = (Facture) entityManager.createQuery("Select f from Facture f where f.id = :id")
                .setParameter("id", id)
                .getSingleResult();
        facture.setLignesFacture(lignes);
        return facture;
    }
}

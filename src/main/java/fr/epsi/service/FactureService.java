package fr.epsi.service;

import fr.epsi.dao.FactureDao;
import fr.epsi.dao.IFactureDao;
import fr.epsi.entite.Facture;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.List;

@Stateless
public class FactureService implements IFactureService {

    @EJB
    IFactureDao factureDao = new FactureDao();

    @Override
    public List<Facture> findAllFactures() {
        List<Facture> factures = this.factureDao.findAll();
        return factures;
    }

    @Override
    public Facture findOneById(Long id) {
        Facture facture = this.factureDao.findOneById(id);
        return facture;
    }
}

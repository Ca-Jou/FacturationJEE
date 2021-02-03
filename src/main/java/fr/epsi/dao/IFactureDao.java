package fr.epsi.dao;

import fr.epsi.entite.Facture;

import java.util.List;

public interface IFactureDao {
    List<Facture> findAll();
    Facture findOneById(Long id);
}

package fr.epsi.service;

import fr.epsi.entite.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> findAllFactures();
    Facture findOneById(Long id);
}

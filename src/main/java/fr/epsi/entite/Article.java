package fr.epsi.entite;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected String nom;
    protected String code;
    protected double prix;

    @OneToMany(mappedBy = "article" )
    protected Collection<LigneFacture> lignesFacture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Collection<LigneFacture> getLignesFacture() {
        return lignesFacture;
    }

    public void setLignesFacture(Collection<LigneFacture> lignesFacture) {
        this.lignesFacture = lignesFacture;
    }
}

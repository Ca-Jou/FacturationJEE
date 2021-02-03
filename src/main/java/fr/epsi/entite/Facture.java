package fr.epsi.entite;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected Date date;
    protected String numero;
    protected double montant;

    @ManyToOne
    protected Client client;

    @OneToMany(mappedBy = "facture")
    protected Collection<LigneFacture> lignesFacture;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Collection<LigneFacture> getLignesFacture() {
        return lignesFacture;
    }

    public void setLignesFacture(Collection<LigneFacture> lignesFacture) {
        this.lignesFacture = lignesFacture;
    }
}

package org.elguazzar.commmandeservice.entities;

import jakarta.persistence.*;

@Entity
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String idProduit;
    private int quantite;
    private double prix;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

}

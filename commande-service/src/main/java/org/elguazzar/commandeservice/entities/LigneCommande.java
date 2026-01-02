package org.elguazzar.commandeservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String idProduit;
    @Transient
    private Product produit;
    private int quantite;
    private double prix;
    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

}

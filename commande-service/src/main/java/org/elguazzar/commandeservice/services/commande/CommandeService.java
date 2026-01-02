package org.elguazzar.commandeservice.services.commande;

import org.elguazzar.commandeservice.entities.Commande;

import java.util.List;

public interface CommandeService {
    Commande addCommande(Commande commande);
    void deleteCommande(String id);
    Commande updateCommande(String id,Commande commande);
    Commande getCommandeById(String id);
    List<Commande> getAllCommandes();
}

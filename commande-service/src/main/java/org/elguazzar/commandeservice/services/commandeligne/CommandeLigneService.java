package org.elguazzar.commandeservice.services.commandeligne;

import org.elguazzar.commandeservice.entities.Commande;
import org.elguazzar.commandeservice.entities.LigneCommande;

import java.util.List;

public interface CommandeLigneService {
    LigneCommande addCommandeLigne(LigneCommande ligneCommande);
    LigneCommande getCommandeLigneById(String id);
    void deleteCommandeLigne(String id);
    LigneCommande updateCommandeLigne(String id,LigneCommande ligneCommande);
    List<LigneCommande> getAllCommandeLignes();
}

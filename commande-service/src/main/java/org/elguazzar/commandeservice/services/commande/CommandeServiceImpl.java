package org.elguazzar.commandeservice.services.commande;

import lombok.AllArgsConstructor;
import org.elguazzar.commandeservice.entities.Commande;
import org.elguazzar.commandeservice.exceptions.CommandeNotFoundException;
import org.elguazzar.commandeservice.repositories.CommandeRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeServiceImpl implements CommandeService {
    private CommandeRepo commandeRepo;
    @Override
    public Commande addCommande(Commande commande) {

        return commandeRepo.save(commande);
    }

    @Override
    public void deleteCommande(String id) {
        if (!commandeRepo.existsById(id)) {
            throw new CommandeNotFoundException("Commande with id " + id + " not found");
        }

    }

    @Override
    public Commande updateCommande(String id, Commande commande) {
       if (!commandeRepo.existsById(id)) {
           throw new CommandeNotFoundException("Commande with id " + id + " not found");
       }
       Commande retrievedCommande = commandeRepo.save(commande);
       retrievedCommande.setCommandeDate(commande.getCommandeDate());
       retrievedCommande.setCommandeStatus(commande.getCommandeStatus());
       retrievedCommande.setMontantTotal(commande.getMontantTotal());
       retrievedCommande.setLignes(commande.getLignes());
       commandeRepo.save(retrievedCommande);
       return retrievedCommande;


    }

    @Override
    public Commande getCommandeById(String id) {
        if (!commandeRepo.existsById(id)) {
            throw new CommandeNotFoundException("Commande with id " + id + " not found");
        }
        return commandeRepo.findById(id).orElseThrow();
    }

    @Override
    public List<Commande> getAllCommandes() {
        return commandeRepo.findAll();
    }
}

package org.elguazzar.commandeservice.repositories;


import org.elguazzar.commandeservice.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepo extends JpaRepository<LigneCommande,String> {
}

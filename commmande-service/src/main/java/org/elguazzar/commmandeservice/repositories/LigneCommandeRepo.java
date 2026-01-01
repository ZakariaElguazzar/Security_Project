package org.elguazzar.commmandeservice.repositories;


import org.elguazzar.commmandeservice.entities.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepo extends JpaRepository<LigneCommande,String> {
}

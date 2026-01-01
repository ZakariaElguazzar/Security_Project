package org.elguazzar.commmandeservice.repositories;


import org.elguazzar.commmandeservice.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeRepo extends JpaRepository<Commande, String> {
}

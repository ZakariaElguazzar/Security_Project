package org.elguazzar.commandeservice.repositories;


import org.elguazzar.commandeservice.entities.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CommandeRepo extends JpaRepository<Commande, String> {
}

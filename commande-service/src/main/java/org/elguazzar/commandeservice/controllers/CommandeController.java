package org.elguazzar.commandeservice.controllers;

import lombok.AllArgsConstructor;
import org.elguazzar.commandeservice.entities.Commande;
import org.elguazzar.commandeservice.services.commande.CommandeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commandes")
@AllArgsConstructor
public class CommandeController {
    private CommandeService commandeService;

    @GetMapping("/get/{id}")
    public ResponseEntity<Commande> getById(@PathVariable String id){
        return ResponseEntity.ok(commandeService.getCommandeById(id));
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<Commande>> getAll(){
        return ResponseEntity.ok(commandeService.getAllCommandes());
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable  String id){
        commandeService.deleteCommande(id);
    }

    @PutMapping("/update/{id}")
    public Commande updateById(@RequestBody Commande commande, @PathVariable String id){
        return commandeService.updateCommande(id,commande);
    }

}

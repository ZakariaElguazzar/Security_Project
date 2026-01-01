package org.elguazzar.commmandeservice.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.elguazzar.commmandeservice.enums.CommandeStatus;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String commandeId;
    private Date commandeDate;
    @Enumerated(EnumType.STRING)
    private CommandeStatus commandeStatus;
    private double montantTotal;
    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private List<LigneCommande> lignes;


}

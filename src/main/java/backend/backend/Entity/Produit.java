package backend.backend.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namep;
    private int qt;
    private Boolean disponible;
    private LocalDate date_cre;
    private LocalDate date_mod;
    @ManyToOne
   private Categorie categorie ;

}

package backend.backend.web;
import backend.backend.Entity.Produit;
import backend.backend.service.produitservice;
import backend.backend.service.Categorieservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController


public class produitRestController {

        @Autowired
        private produitservice produitservice;
        @Autowired
        private Categorieservice categorieservice;

        @PostMapping("/produitsave/{id}")
        public String  addproduit(@RequestBody Produit produit, @PathVariable long id){
            produitservice.addproduit(produit,id);
            return "produit a eté ajoutée avec succée...";

        }
        @GetMapping("/Produits")
        public List<Produit> getproduits(){
            return produitservice.getproduits();
        }
        @GetMapping("/produit/{id}")
        Produit getproduitByid(@PathVariable Long id){
            return this.produitservice.getproduitByid(id);
        }
        @PutMapping("/updateproduit/{id}")
        public String updateproduit(@PathVariable("id") long id, @RequestBody Produit produit){
            produitservice.updateproduit(id, produit);
            return "produit a eté modifiée avec succée...";
        }

        @DeleteMapping("/deleteproduit/{id}")
        public String deleteproduit(@PathVariable("id") long id){
            produitservice.deleteproduit(id);
            return "produit a eté supprimée avec succée...";
        }

    }

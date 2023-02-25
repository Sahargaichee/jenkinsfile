package backend.backend.web;

import backend.backend.Entity.Categorie;
import backend.backend.service.Categorieservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")

public class CategorieRestController {
    @Autowired
    Categorieservice categorieservice;
    @PostMapping("/add")
    public String addcategorie(@RequestBody Categorie categorie){
       System.err.println("hii");
        categorieservice.addcategorie(categorie);
        return "categorie a eté ajoutée avec succée...";
    }

    @GetMapping("/categories")
    public List<Categorie> getcategories(){
        return categorieservice.getcategories();
    }

    @GetMapping("/categorie/{id}")
    public Categorie getcategorieById(@PathVariable("id") Long id){
        return categorieservice.getcategorieByid(id);
    }

    @PutMapping("/update/{id}")
    public String updatecategorie(@PathVariable("id") long id, @RequestBody Categorie Categorie){
        categorieservice.updatecategorie(id, Categorie);
        return "categorie a eté modifiée avec succée...";
    }

    @DeleteMapping("/delete/{id}")
    public String deletecategorie(@PathVariable("id") long id){
        categorieservice.deletecategorie(id);
        return "categorie a eté supprimée avec succée...";
    }
}



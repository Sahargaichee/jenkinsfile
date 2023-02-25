package backend.backend.service;

import backend.backend.Entity.Categorie;
import backend.backend.Entity.Produit;
import backend.backend.repositories.ProduitRepository;
import backend.backend.repositories.CategorieRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class ProduitServiceImpl implements produitservice{
    final private  ProduitRepository produitRepository;
    private final CategorieRepository  categorirRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository, CategorieRepository categorirRepository) {
        this.produitRepository = produitRepository;
        this.categorirRepository = categorirRepository;
    }
    @Override
    public Produit addproduit(Produit produit,Long id ) {
        Categorie categorie = categorirRepository.findById(id).orElse(null);
        produit.setCategorie(categorie);
        LocalDate date = LocalDate.now();
        produit.setDate_cre(date);
        produit.setDate_mod(date);
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> getproduits() {
        return null;
    }

    @Override
    public Produit getproduitByid(Long id) {
        return null;
    }

    @Override
    public Produit updateproduit(Long id, Produit produit) {
        return null;
    }

    @Override
    public void deleteproduit(long id) {

    }
}


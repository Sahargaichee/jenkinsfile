package backend.backend.service;

import backend.backend.Entity.Produit;

import java.util.List;

public interface produitservice {
    public Produit addproduit(Produit produit , Long id);

    public List<Produit> getproduits();

    public Produit getproduitByid(Long id);

    public Produit updateproduit(Long id , Produit produit);

    public void deleteproduit(long id);

}

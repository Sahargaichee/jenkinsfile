package backend.backend.service;

import backend.backend.Entity.Categorie;
import backend.backend.repositories.CategorieRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class CategorieServiceImpl implements Categorieservice{
     private CategorieRepository CategorirRepository;
     public CategorieServiceImpl(CategorieRepository categorirRepository) {
        CategorirRepository = categorirRepository;
    }

    @Override
    public Categorie addcategorie(Categorie Categorie) {

        LocalDate date = LocalDate.now();
        Categorie.setDatecreation(date);
        Categorie.setDatemodif(date);
        return CategorirRepository.save(Categorie);
    }

    @Override
    public List<Categorie> getcategories() {

        return  CategorirRepository.findAll();
    }

    @Override
    public Categorie getcategorieByid(long id) {
        return CategorirRepository.findById(id).get();
    }

    @Override
    public Categorie updatecategorie(long id, Categorie Categorie) {
        Categorie categorie1 = CategorirRepository.findById(id).get();
        categorie1.setName( Categorie.getName());
        categorie1.setQt( Categorie.getQt());
        categorie1.setDatecreation( Categorie.getDatecreation());
        categorie1.setDatemodif( Categorie.getDatemodif());
        return CategorirRepository.save(categorie1);
    }



    @Override
    public void deletecategorie(Long id) {
        CategorirRepository.deleteById(id);
    }
}

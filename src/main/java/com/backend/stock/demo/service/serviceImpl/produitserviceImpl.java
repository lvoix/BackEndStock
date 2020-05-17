package com.backend.stock.demo.service.serviceImpl;

import com.backend.stock.demo.entity.produit;
import com.backend.stock.demo.service.produitService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class produitserviceImpl implements produitService{

    List<produit> listproduits;
    public produitserviceImpl(){
         listproduits =  new ArrayList<produit>();
         listproduits.add(new produit("1234", 34, 120));
         listproduits.add(new produit("5664", 67, 130));
         listproduits.add(new produit("1234", 356, 100));
         listproduits.add(new produit("8734", 387, 399));


    }
    @Override
    public List<produit> getProduits() {
        return listproduits;
    }

    @Override
    public void addProduit(produit pro) {
            listproduits.remove(pro);
            listproduits.add(pro);
    }

    @Override
    public void UpdateProduit(produit pro) {
            listproduits.add(pro);
    }

    @Override
    public void deleteProduit(Long id) {
           produit pro = new produit();
           pro.setId(id);
           listproduits.remove(pro);
    }
}

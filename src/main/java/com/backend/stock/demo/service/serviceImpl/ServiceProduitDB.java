package com.backend.stock.demo.service.serviceImpl;

import com.backend.stock.demo.entity.produit;
import com.backend.stock.demo.repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.backend.stock.demo.service.produitService;

import java.util.List;

@Service
@Primary
public class ServiceProduitDB implements produitService {

    @Autowired
    ProduitRepository produitrepository;

    @Override
    public List<produit> getProduits() {
        return produitrepository.findAll();
    }

    @Override
    public void addProduit(produit pro) {
        produitrepository.save(pro);
    }

    @Override
    public void UpdateProduit(produit pro) {
        produitrepository.save(pro);
    }

    @Override
    public void deleteProduit(Long id) {
        produit pro = new produit();
        pro.setId(id);
        produitrepository.delete(pro);
    }
}

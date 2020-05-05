package com.backend.stock.demo.service;
import com.backend.stock.demo.entity.produit;

import java.util.List;

public interface produitService {

    List<produit> getProduits();
    void addProduit(produit pro);
    void UpdateProduit(produit pro);
    void deleteProduit(String ref);

}

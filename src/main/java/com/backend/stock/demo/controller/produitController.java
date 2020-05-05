package com.backend.stock.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.backend.stock.demo.service.produitService;
import com.backend.stock.demo.entity.produit;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("api/produit")
public class produitController {

    @Autowired
    produitService produitservice;

    @GetMapping
    List<produit> getProduits (){
        return produitservice.getProduits();
    }
    @PostMapping
    void addProduit(@RequestBody produit pro){
        produitservice.addProduit(pro);
    }
    @PutMapping
    void UpadteProduit(@RequestBody produit pro){
        produitservice.UpdateProduit(pro);
    }
    @DeleteMapping("/ref")
    void deleteProduit(@PathVariable String ref){
        produitservice.deleteProduit(ref);
    }

}

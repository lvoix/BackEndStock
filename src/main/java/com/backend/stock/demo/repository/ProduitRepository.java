package com.backend.stock.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.backend.stock.demo.entity.produit;

@Repository
public interface ProduitRepository extends JpaRepository<produit, Long>{

}

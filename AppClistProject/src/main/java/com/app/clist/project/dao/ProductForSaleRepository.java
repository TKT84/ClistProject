package com.app.clist.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.clist.project.entities.ProductForSale;

public interface ProductForSaleRepository extends JpaRepository<ProductForSale, Long> {

}

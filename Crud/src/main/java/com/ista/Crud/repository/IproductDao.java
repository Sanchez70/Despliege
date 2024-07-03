package com.ista.Crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.ista.Crud.models.ProductDTO;

@Repository
public interface IproductDao extends MongoRepository<ProductDTO, String>{

}

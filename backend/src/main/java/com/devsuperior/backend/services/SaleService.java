package com.devsuperior.backend.services;

import com.devsuperior.backend.entities.Sale;
import com.devsuperior.backend.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    public List<Sale>  findSale() {
        return repository.findAll();
    }
}

package org.amuji.ninja.inventory.application;

import org.amuji.ninja.inventory.domain.InventoryService;
import org.amuji.ninja.inventory.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class InventoryController {

    @Autowired
    private InventoryService service;

    @GetMapping
    public List<Product> allProducts() {
        return service.getAll();
    }
}

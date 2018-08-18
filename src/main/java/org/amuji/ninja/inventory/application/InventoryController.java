package org.amuji.ninja.inventory.application;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class InventoryController {

    @GetMapping
    public String allProducts() {
        return "The list of the products";
    }
}

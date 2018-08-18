package org.amuji.ninja.inventory.domain;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class InventoryService {
    public List<Product> getAll() {
        log.info("Retrieving all products...");
        return Arrays.asList(
                new Product("iPhone 8", 30),
                new Product("Google Nexus", 10),
                new Product("HiVi M10", 11),
                new Product("Bose SoundLink Mini 2", 12),
                new Product("Aux", 13),
                new Product("Nongfu Spring 4*5L", 14),
                new Product("Logitech M570", 2));
    }

}

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
                Product.builder()
                        .name("iPhone 8")
                        .quantity(30)
                        .build(),
                Product.builder()
                        .name("Google Nexus")
                        .quantity(10)
                        .build());
    }

}

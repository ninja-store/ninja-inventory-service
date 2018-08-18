package org.amuji.ninja.inventory.domain;

import lombok.*;

import java.util.UUID;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private String id;
    private String name;
    private int quantity;

    public Product(String name, int quantity) {
        id = UUID.randomUUID().toString();
        this.name = name;
        this.quantity = quantity;
    }
}

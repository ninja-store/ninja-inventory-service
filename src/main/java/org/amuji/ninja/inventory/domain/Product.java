package org.amuji.ninja.inventory.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Product {
    private String id;
    private String name;
    private int quantity;
}

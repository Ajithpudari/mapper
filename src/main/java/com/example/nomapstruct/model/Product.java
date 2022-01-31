package com.example.nomapstruct.model;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data

public class Product {

    private int id;
    private String name;
    private String quantity;
    private long price;


}

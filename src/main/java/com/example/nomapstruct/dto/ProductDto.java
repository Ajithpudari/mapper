package com.example.nomapstruct.dto;


import lombok.*;


import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class ProductDto {

    private int id;
    private String name;
    private String data;
    private String quantity;
    private long price;

    public String getData(){
        return UUID.randomUUID().toString();
    }
}

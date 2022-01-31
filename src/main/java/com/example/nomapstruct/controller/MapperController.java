package com.example.nomapstruct.controller;

import com.example.nomapstruct.dto.ProductDto;
import com.example.nomapstruct.model.Product;
import com.example.nomapstruct.productmapper.MapperImplClass;
import com.example.nomapstruct.productmapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MapperController {


    ProductMapper productMapper=new MapperImplClass();

    @GetMapping("/test")
    public String testMapper(){
        Product product=new Product(1,"Wire","Friend",2000);
        ProductDto productDto= productMapper.modelTodto(product);

        productDto.setData(productDto.getData());
        System.out.println(productDto);
        return "Success";
    }
}

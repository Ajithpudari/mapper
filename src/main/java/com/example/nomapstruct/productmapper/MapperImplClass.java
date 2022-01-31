package com.example.nomapstruct.productmapper;

import com.example.nomapstruct.dto.ProductDto;
import com.example.nomapstruct.model.Product;

public class MapperImplClass implements  ProductMapper{

    @Override
    public ProductDto modelTodto(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setPrice(product.getPrice());
        productDto.setQuantity(product.getQuantity());
        return productDto;

    }

    @Override
    public Product dtoTomodel(ProductDto productDto) {
        Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setQuantity(product.getQuantity());
        return product;
    }
}

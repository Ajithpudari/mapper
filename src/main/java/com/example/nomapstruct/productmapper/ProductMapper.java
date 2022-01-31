package com.example.nomapstruct.productmapper;

import com.example.nomapstruct.dto.ProductDto;
import com.example.nomapstruct.model.Product;

public interface ProductMapper {
    ProductDto modelTodto(Product product);
    Product dtoTomodel(ProductDto productDto);
}

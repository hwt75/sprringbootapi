// package com.springbootapi.springbootapi.repository.implement;

// import java.math.BigDecimal;
// import java.util.List;

// import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.stereotype.Repository;

// import com.springbootapi.springbootapi.entity.ProductEntity;
// import com.springbootapi.springbootapi.repository.ProductRepository;

// @Repository
// public class ProductRepositoryImplement implements ProductRepository{
//     @Override
//     public ProductEntity createProduct(ProductEntity product){
//         ProductEntity productEntity = new ProductEntity();
//         productEntity.setId(1L);
//         productEntity.setProductname("tesst");
//         productEntity.setProductPrice(new BigDecimal("21.6"));
//         return null;
//     }
//     @Override
//     public List<ProductEntity> findAllProducts(){
//         ProductEntity productEntity = new ProductEntity();
//         productEntity.setId(1L);
//         productEntity.setProductname("tesst");
//         productEntity.setProductPrice(new BigDecimal("21.6"));
//         return List.of(productEntity);
//     }
// }

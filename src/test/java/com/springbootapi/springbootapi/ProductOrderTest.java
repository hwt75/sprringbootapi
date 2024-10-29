package com.springbootapi.springbootapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.springbootapi.springbootapi.entity.OrderEntity;
import com.springbootapi.springbootapi.entity.ProductEntity;
import com.springbootapi.springbootapi.repository.OrderRepository;
import com.springbootapi.springbootapi.repository.ProductRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.transaction.Transactional;

@SpringBootTest
public class ProductOrderTest {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Test
    @Transactional
    @Rollback(false)
    void manyToManyTest(){
        List<ProductEntity> listProduct = new ArrayList<>();
        List<OrderEntity> listOrder = new ArrayList<>();
        for(int i = 0; i<10; i++){
            OrderEntity orderEntity = new OrderEntity();
            ProductEntity productEntity = new ProductEntity();
            productEntity.setProductPrice(new BigDecimal(10000 + i*10));
            productEntity.setProductname("product " + i);
            listProduct.add(productEntity);
            orderEntity.setUserId(1);
            orderEntity.setProductList(listProduct);
            
            listOrder.add(orderEntity);
        }
        orderRepository.saveAll(listOrder);
        productRepository.saveAll(listProduct);
    }
}

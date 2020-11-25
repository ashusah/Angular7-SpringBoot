package com.productlist.productlist;

import com.productlist.productlist.model.Product;
import com.productlist.productlist.model.User;
import com.productlist.productlist.repository.UserRepository;
import com.productlist.productlist.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProductListApplication  {

    public static void main(String[] args) {
        SpringApplication.run(ProductListApplication.class, args);
    }

}

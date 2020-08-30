package com.example.springbootangular;

import com.example.springbootangular.model.Category;
import com.example.springbootangular.model.Product;
import com.example.springbootangular.repository.CategoryRepo;
import com.example.springbootangular.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

@Controller
@SpringBootApplication
public class SpringBootAngularApplication {

    private CategoryRepo categoryRepo;
    private ProductRepo productRepo;

    @Autowired
    public SpringBootAngularApplication(CategoryRepo categoryRepo, ProductRepo productRepo) {
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAngularApplication.class, args);
        System.out.println("DAsdas");
    }




    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
        System.out.println("hello");
        Category category = new Category("BOOKS");
        Category category2 = new Category("MUGS");
        Product product1 = new Product("ABC", "Book1", "A piece of bread", BigDecimal.valueOf(7.5),"assets/images/products/books/book-luv2code-1000.png",true,3,new Date(),new Date(),category);
        Product product2 = new Product("ABC", "Book2", "A piece of bread", BigDecimal.valueOf(7.5),"assets/images/products/books/book-luv2code-1001.png",true,3,new Date(),new Date(),category);
        Product product3 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5),"assets/images/products/books/book-luv2code-1002.png",true,3,new Date(),new Date(),category);
        Product product4 = new Product("CDD", "Mug1", "A piece of bread", BigDecimal.valueOf(10.5),"assets/images/products/coffeemugs/coffeemug-luv2code-1000.png",true,3,new Date(),new Date(),category2);
        Product product5 = new Product("CDD", "Mug2", "A piece of bread", BigDecimal.valueOf(12.5),"assets/images/products/coffeemugs/coffeemug-luv2code-1001.png",true,3,new Date(),new Date(),category2);
        Product product6 = new Product("CDD", "Mug3", "A piece of bread", BigDecimal.valueOf(4.5),"assets/images/products/coffeemugs/coffeemug-luv2code-1002.png",true,3,new Date(),new Date(),category2);

categoryRepo.saveAll(Arrays.asList(category,category2));
productRepo.saveAll(Arrays.asList(product1,product2,product3,product4,product5,product6));
    }

}

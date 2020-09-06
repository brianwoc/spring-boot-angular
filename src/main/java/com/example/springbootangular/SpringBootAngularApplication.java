package com.example.springbootangular;

import com.example.springbootangular.model.Category;
import com.example.springbootangular.model.Country;
import com.example.springbootangular.model.Product;
import com.example.springbootangular.model.State;
import com.example.springbootangular.repository.CategoryRepo;
import com.example.springbootangular.repository.CountryRepo;
import com.example.springbootangular.repository.ProductRepo;
import com.example.springbootangular.repository.StateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

@Controller
@SpringBootApplication
public class SpringBootAngularApplication {

    private CategoryRepo categoryRepo;
    private ProductRepo productRepo;
    private CountryRepo countryRepo;
    private StateRepo stateRepo;

    @Autowired
    public SpringBootAngularApplication(CategoryRepo categoryRepo, ProductRepo productRepo, CountryRepo countryRepo, StateRepo stateRepo) {
        this.categoryRepo = categoryRepo;
        this.productRepo = productRepo;
        this.countryRepo = countryRepo;
        this.stateRepo = stateRepo;
    }

    @Autowired


    public static void main(String[] args) {
        SpringApplication.run(SpringBootAngularApplication.class, args);
        System.out.println("DAsdas");
    }


    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
        System.out.println("hello");
        Category category = new Category("BOOKS");
        Category category2 = new Category("MUGS");
        Product product1 = new Product("ABC", "Book1", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1000.png", true, 3, new Date(), new Date(), category);
        Product product2 = new Product("ABC", "Book2", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1001.png", true, 3, new Date(), new Date(), category);
        Product product3 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1002.png", true, 3, new Date(), new Date(), category);
        Product product4 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1003.png", true, 3, new Date(), new Date(), category);
        Product product5 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1004.png", true, 3, new Date(), new Date(), category);
        Product product6 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1005.png", true, 3, new Date(), new Date(), category);
        Product product7 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1006.png", true, 3, new Date(), new Date(), category);
        Product product8 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1007.png", true, 3, new Date(), new Date(), category);
        Product product9 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1008.png", true, 3, new Date(), new Date(), category);
        Product product10 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.d), "assets/images/products/books/book-luv2code-1009.png", true, 3, new Date(), new Date(), category);
        Product product11 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1010.png", true, 3, new Date(), new Date(), category);
        Product product12 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1011.png", true, 3, new Date(), new Date(), category);
        Product product13 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1012.png", true, 3, new Date(), new Date(), category);
        Product product14 = new Product("CDD", "Book3", "A piece of bread", BigDecimal.valueOf(7.5), "assets/images/products/books/book-luv2code-1013.png", true, 3, new Date(), new Date(), category);
        Product product15 = new Product("CDD", "Mug1", "A piece of bread", BigDecimal.valueOf(10.5), "assets/images/products/coffeemugs/coffeemug-luv2code-1000.png", true, 3, new Date(), new Date(), category2);
        Product product16 = new Product("CDD", "Mug2", "A piece of bread", BigDecimal.valueOf(12.5), "assets/images/products/coffeemugs/coffeemug-luv2code-1001.png", true, 3, new Date(), new Date(), category2);
        Product product17 = new Product("CDD", "Mug3", "A piece of bread", BigDecimal.valueOf(4.5), "assets/images/products/coffeemugs/coffeemug-luv2code-1002.png", true, 3, new Date(), new Date(), category2);

        Country polska = new Country("PL", "Polska");
        Country czechy = new Country("CZ", "Czechy");


        State state = new State(polska, "Slask");
        State state1 = new State(polska, "Opolskie");
        State state2 = new State(polska, "Malopolskie");
        State state3 = new State(polska, "Mazowieckie");
        State state4 = new State(polska, "Podkaparckie");
        State state5 = new State(czechy, "Slask");
        State state6 = new State(czechy, "Morawy");

        countryRepo.saveAll(Arrays.asList(polska,czechy));
        stateRepo.saveAll(Arrays.asList(state,state1,state2,state3, state4,state5,state6));

        categoryRepo.saveAll(Arrays.asList(category, category2));
        productRepo.saveAll(Arrays.asList(product1, product2, product3, product4, product5, product6, product7, product8, product9, product10, product11, product12, product13, product14, product15, product16, product17));
    }

}

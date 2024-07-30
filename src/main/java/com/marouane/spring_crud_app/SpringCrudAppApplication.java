package com.marouane.spring_crud_app;

import com.marouane.spring_crud_app.entities.Product;
import com.marouane.spring_crud_app.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringCrudAppApplication implements CommandLineRunner {
    @Autowired
    private ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringCrudAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception{
        productRepository.save(new Product(null,"product 1",12.7,2));
        productRepository.save(new Product(null,"product 2",12.7,2));
        List<Product> products =productRepository.findAll();
        //products.forEach(p->{
          //  System.out.println(p.toString());
        //});
        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println(product.toString());

    }

}

package com.comek.springstarter.demo;

import com.comek.springstarter.demo.interfaces.BookService;
import com.comek.springstarter.demo.interfaces.OpinionService;
import com.comek.springstarter.demo.interfaces.ShopService;
import com.comek.springstarter.demo.model.Book;
import com.comek.springstarter.demo.model.Opinion;
import com.comek.springstarter.demo.model.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    @Autowired
    private OpinionService opinionService;

    @Autowired
    private ShopService shopService;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        Book book1 = new Book("Title", "Author");
        Book book2 = new Book("Title 2", "Author 2");

//        bookService.saveBook(book1);
//        bookService.saveBook(book2);

        Opinion opinion1 = new Opinion(book1, "adam", "very good");
        Opinion opinion2 = new Opinion(book2, "roman", "very bad");

        opinionService.saveOpinion(opinion1);
        opinionService.saveOpinion(opinion2);

        Shop shop1 = new Shop("Shop1", "Street1", "City1");
        Shop shop2 = new Shop("Shop2", "Street2", "City2");

        shopService.saveShop(shop1);
        shopService.saveShop(shop2);
    }
}

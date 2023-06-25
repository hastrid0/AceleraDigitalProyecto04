package library.demo.util;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import library.demo.model.Book;
import library.demo.service.BookService;

@Component
public class BookFiller {
    private final BookService bookService;
    
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @PostConstruct
    public void init()
    {
        Book book1 = new Book("La comunidad del anillo","Primera entrega del senior de los anillos","J.R Tolkien");
        bookService.addBook(book1);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){};
        Book book2 = new Book("La dos torres","Segunda entrega del senior de los anillos","J.R Tolkien");
        bookService.addBook(book2);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){};
        Book book3 = new Book("El retorno del rey","Tercera entrega del senior de los anillos","J.R Tolkien");
        bookService.addBook(book3);

    }
}

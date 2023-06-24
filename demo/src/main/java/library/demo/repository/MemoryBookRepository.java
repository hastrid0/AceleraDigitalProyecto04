package library.demo.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import library.demo.model.Book;

@Repository
public class MemoryBookRepository implements IBookRepository{
    private Map<String, Book> booksMap;
    
    public MemoryBookRepository() {
        this.booksMap = new HashMap<>();
    }

    @Override
    public List<Book> getAll() {
        List<Book> ret = new ArrayList<>();
        ret.addAll(booksMap.values());

        return ret;
    }

    @Override
    public Book get(String bookId) {
       return booksMap.get(bookId);
    }

    @Override
    public Book save(Book book) {
        if(book.getBookId() == null){
          book.setBookId(String.valueOf(System.currentTimeMillis()));
        }
        return booksMap.put(book.getBookId(), book);
    }

    @Override
    public Book delete(String bookId) {
        return booksMap.remove(bookId);
    }
    
}

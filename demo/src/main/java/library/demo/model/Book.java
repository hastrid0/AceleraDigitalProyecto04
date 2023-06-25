package library.demo.model;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Book {
  private String bookId;
  private String tittle;
  private String description;
  private String author;

public Book(String tittle, String description, String author) {
    this.tittle = tittle;
    this.description = description;
    this.author = author;
}
public void setBookId(String bookId){
    this.bookId = bookId;
}
public String getBookId(){
    return this.bookId;
}
}

package org.lap4.books;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Objects;

@Data
@Builder
@AllArgsConstructor
public class Book {

    private final int id;
    private String name;
    private String author;
    private BookGenre genre;
    private String publisher;
    private int yearOfPublication;

    public Book(int id, String name, String author, BookGenre genre) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return id == book.id && yearOfPublication == book.yearOfPublication &&
                Objects.equals(name, book.name) && Objects.equals(author, book.author)
                && genre == book.genre && Objects.equals(publisher, book.publisher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, author, genre, publisher, yearOfPublication);
    }

    @Override
    public String toString() {
        return "Book information:\n"
                + "\t\tname: " + name + "\n"
                + "\t\tauthor: " + author + "\n"
                + "\t\tgenre: " + genre + "\n"
                + "\t\tpublisher: " + publisher + "\n"
                + "\t\tyear of publication: " + yearOfPublication;
    }
}


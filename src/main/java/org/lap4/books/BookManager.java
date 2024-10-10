package org.lap4.books;

import java.util.List;

public class BookManager {

    private static final List<Book> books = List.of(
            new Book(1, "To Kill a Mockingbird", "Harper Lee", BookGenre.FICTION, "J.B. Lippincott & Co.", 1960),
            new Book(2, "Harry Potter and the Philosopher's Stone", "J.K. Rowling", BookGenre.FANTASY, "Bloomsbury", 1997),
            new Book(3, "The Odyssey", "Homer", BookGenre.EPIC_POETRY, "Penguin Classics", 1996),
            new Book(4, "The Road", "Cormac McCarthy", BookGenre.POST_APOCALYPTIC_FICTION, "Alfred A. Knopf", 2006),
            new Book(5, "Pride and Prejudice", "Jane Austen", BookGenre.ROMANCE, "T. Egerton", 1813),
            new Book(6, "Fahrenheit 451", "Ray Bradbury", BookGenre.SCIENCE_FICTION, "Ballantine Books", 1953),
            new Book(7, "The Outsider", "Stephen King", BookGenre.HORROR, "Scribner", 2018),
            new Book(8, "Sapiens: A Brief History of Humankind", "Yuval Noah Harari", BookGenre.NON_FICTION, "Harper", 2014),
            new Book(9, "The Alchemist", "Paulo Coelho", BookGenre.FICTION, "HarperOne", 1988),
            new Book(10, "The Catcher in the Rye", "J.D. Salinger", BookGenre.FICTION, "Little, Brown and Company", 1951)
                // ... more books
    );

    public static boolean addBook(Book book) {

        if( book == null ) return false;
        if (books.contains(book)) return false;

        return books.add(book);
    }

    public static Book findBookByName(String name) {

        return books.stream().filter(b -> b.getName().equalsIgnoreCase(name)).
                findFirst().orElse(null);
    }

    public static List<Book> findBookByGenre(String genre) {

        return books.stream().filter(b -> b.getGenre().toString().equalsIgnoreCase(genre))
                .toList();
    }

    public static List<Book> findBookByYearOfPublishing(int year) {

        return books.stream().filter(b -> b.getYearOfPublication() == year)
                .toList();
    }

    public static List<Book> findBooksByAuthor(String author) {

        return books.stream().filter(b -> b.getAuthor().equalsIgnoreCase(author))
                .toList();
    }
}

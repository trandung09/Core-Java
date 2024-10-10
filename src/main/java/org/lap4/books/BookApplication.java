package org.lap4.books;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class BookApplication {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void printOutBooksInfo(List<Book> books) {
        if (books == null || books.isEmpty()) {
            System.out.println("No Books Found");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public void application() throws IOException {

        String answer, request;
        while (true) {
            menu();
            System.out.print("Please enter your choose: ");
            answer = br.readLine();

            switch (answer) {
                case "1":
                    System.out.print("Please enter the name of the book: ");
                    request = br.readLine();
                    Book book = BookManager.findBookByName(request);
                    System.out.println(book == null ? "Book not found" : (book.toString()));
                    break;
                case "2":
                    System.out.print("Please enter the genre of the book: ");
                    request = br.readLine();
                    printOutBooksInfo(BookManager.findBookByGenre(request));
                    break;
                case "3":
                    System.out.print("Please enter the year publication of the book: ");
                    request = br.readLine();
                        printOutBooksInfo(BookManager.findBookByYearOfPublishing(Integer.parseInt(request)));
                    break;
                case "0":
                    System.exit(0);
                default:
                    System.out.println("Invalid input");
            }

            System.out.print("Do you wish to continue? (y/n): ");
            answer = br.readLine();

            if (answer.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }
    }

    public void menu() {
        System.out.println("1. Find books by name.");
        System.out.println("2. List books by genre.");
        System.out.println("3. List books by year of publication.");
        System.out.println("0. Exit.");
    }


    public static void main(String[] args) throws IOException {

        new BookApplication().application();
    }
}

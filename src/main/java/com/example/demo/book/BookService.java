package com.example.demo.book;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class BookService {

    private List<Book> books = new ArrayList<>(Arrays.asList(
            new Book("hoho","huhu",1),
            new Book("lili","lala",2),
            new Book("soth","lilo",3)
    ));

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBook(int id) {
        return books.stream().filter(b -> b.getId() == id).findFirst().get();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(int id) {
        for (int i=0; i< books.size(); i++)
            if(books.get(i).getId() == id) {
                books.remove(i);
                return;
            }
    }

    public void updateBook(int id, Book book) {
        for (int i=0; i< books.size(); i++)
            if(books.get(i).getId() == id) {
                books.set(i, book);
                return;
            }
    }
}

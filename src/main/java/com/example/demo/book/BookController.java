package com.example.demo.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("/book")
    public List<Book> getBooks() {
        return bookService.getAllBooks();
    }
//
    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        bookService.addBook(book);
    }
//
    @RequestMapping(value = "/book/{id}",method = RequestMethod.PUT)
    public void updateBook(@RequestBody Book book) {
        bookService.updateBook(book);
    }
    @RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}

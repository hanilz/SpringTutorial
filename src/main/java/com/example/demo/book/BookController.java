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
    @RequestMapping("/book/{id}")
    public Book getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }
    @RequestMapping(value = "/book",method = RequestMethod.POST)
    public void addBook(@RequestBody Book book) {
        System.out.println(book);
        bookService.addBook(book);
    }
//    @RequestMapping("/book/id")
//    public void deleteBook
}

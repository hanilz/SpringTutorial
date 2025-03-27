package com.example.demo.book;

public class Book {
    private String name;
    private String author;
    private int id;


    public Book(String name, String author, int id) {
        this.name = name;
        this.author = author;
        this.id = id;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
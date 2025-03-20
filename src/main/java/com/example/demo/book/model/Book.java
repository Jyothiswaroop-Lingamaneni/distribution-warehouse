package com.example.demo.book.model;
import jakarta.persistence.*;
@Entity

@Table(name = "book")
public class Book {


        @Id
        private Integer id;

        @Column(name = "bookname")
        private String bookName;

        @Column(name = "author")
        private String Author;

        @Column(name="yearofpublish")
        private int YearOfPublish;

        private String genre;

        private String title;

        private Double price;

        private String language;

    public Book() {}


    public Book(Integer id, String bookName, String Author, int YearOfPublish, String genre, String title, Double price, String language) {
        this.id =id;
        this.bookName = bookName;
        this.Author = Author;
        this.YearOfPublish = YearOfPublish;
        this.genre = genre;
        this.title = title;
        this.price = price;
        this.language = language;
    }

    public Integer getId() {
        return id;
    }
    public String getBookName() {
        return bookName;
    }
    public String getAuthor() {
        return Author;
    }
    public int getYearOfPublish() {
        return YearOfPublish;
    }
    public String getGenre() {
        return genre;
    }
    public String getTitle() {
        return title;
    }
    public Double getPrice() {
        return price;
    }
    public String getLanguage(){
        return language;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
    public void setYearOfPublish(int YearOfPublish) {
        this.YearOfPublish = YearOfPublish;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setLanguage(String language){
        this.language=language;
    }
}




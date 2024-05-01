package com.ohgiraffers.section01.list.dto;

public class BookDTO {

    private int number;
    private String title;
    private String Author;
    private int price;

    public BookDTO(){
    }

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        Author = author;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", Author='" + Author + '\'' +
                ", price=" + price +
                '}';
    }
}

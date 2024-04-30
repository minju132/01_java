package com.ohgiraffers.section02.encapsulation.answer;

public class ApplicationLibrary {
    public static void main(String[]args){

        Book[] books = new Book[3];

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        books[0].title = "First Java";
        books[1].title = "The little mermaid";
        books[2].title = "The Ugly Duckling";

        books[0].author = "유영진";
        books[1].author = "안데르센";
        books[2].author = "안데르센";

        books[0].serialNum = 1;
        books[1].serialNum = 2;
        books[2].serialNum = 3;

        Human minju = new Human();
        minju.name = "김민주";
        minju.pwd = "1234";
        minju.age = 25;
        minju.gender = '남';
        minju.book = books[0];

        System.out.println(books[0].title);



    }
}

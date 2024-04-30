package com.ohgiraffers.section02.encapsulation.library;

public class Library {
    public static void main(String[]args){

        Book_and_PI[] books = new Book_and_PI[3];
        books[0] = new Book_and_PI();
        books[1] = new Book_and_PI();
        books[2] = new Book_and_PI();

        books[0].title = "First Java";
        books[1].title = "The little mermaid";
        books[2].title = "The Ugly Duckling";

        books[0].author = "유영진";
        books[1].author = "안데르센";
        books[2].author = "안데르센";

        books[0].serialNum = 1;
        books[1].serialNum = 2;
        books[2].serialNum = 3;

        Book_and_PI[] humans = new Book_and_PI[3];
        humans[0].name = "김민주";
        humans[1].name = "송재희";
        humans[2].name = "황정한";

        humans[0].pwd = "1234";
        humans[1].pwd = "pass1";
        humans[2].pwd = "pass2";

        humans[0].age = 25;
        humans[1].age = 22;
        humans[2].age = 20;

        humans[0].gender = '남';
        humans[1].gender = '여';
        humans[2].gender = '남';



//        Book_and_PI kimM = new Book_and_PI();
//        kimM.name = "김민주";
//        kimM.age = 25;
//        kimM.pwd = "1234";
//        kimM.gender = '남';
//
//        Book_and_PI song = new Book_and_PI();
//        song.name = "송재희";
//        song.age = 22;
//        song.pwd = "pass1";
//        song.gender = '여';
//
//        Book_and_PI hwang = new Book_and_PI();
//        hwang.name = "황정한";
//        hwang.age = 20;
//        hwang.pwd = "pass2";
//        hwang.gender = '남';
//
//        Book_and_PI firJa = new Book_and_PI();
//        firJa.title = "First Java";
//        firJa.author = "유영진";
//        firJa.serialNum = 1;
//
//        Book_and_PI merMa = new Book_and_PI();
//        merMa.title = "The little mermaid";
//        merMa.author = "안데르센";
//        merMa.serialNum = 2;
//
//        Book_and_PI uglyDu = new Book_and_PI();
//        uglyDu.title = "The Ugly Duckling";
//        uglyDu.author = "안데르센";
//        uglyDu.serialNum = 3;


    }
}

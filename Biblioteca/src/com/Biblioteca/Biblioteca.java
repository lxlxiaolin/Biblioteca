package com.Biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xlluo on 9/30/15.
 */
public class Biblioteca {
    public static List<Book> bookList = new ArrayList<>();

    public static String welcomeMessage(){
        return "welcome";
    }

    public static List<Book> bookList(){
        Book book = new Book();
        book.ISBN = "123456";
        book.Name = "story";
        bookList.add(book);
        return bookList;
    }

    public static Book selectedBook(Book selectedBook){
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).Name == selectedBook.Name)
                return bookList.get(i);
        }
        return null;
    }
}

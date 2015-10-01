package com.Biblioteca;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Biblioteca.welcomeMessage();

        Biblioteca.bookList();

        Book book = new Book();
        book.Name = "a";
        book.ISBN = "123";
        Biblioteca.selectedBook(book);
    }
}

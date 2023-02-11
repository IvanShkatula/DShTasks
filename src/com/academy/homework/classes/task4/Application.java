package com.academy.homework.classes.task4;

public class Application {

  public static void main(String[] args) {
    Reader[] readers = new Reader[10];

    Reader reader1 = new Reader("Ivan Ivanovich", 123, "FMP", "01.01.2021", 123456);
    Reader reader2 = new Reader("Alexei Ivanovich", 321, "FMP", "01.01.2022", 654321);
    readers[0] = reader1;
    readers[1] = reader2;

    Book book1 = new Book("Приключения", "Жюль Верн");
    Book book2 = new Book("Словарь", "Ожигова");
    Book book3 = new Book("Энциклопедия", "Много");


    readers[1].takeBook(3);
    readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
    readers[1].takeBook(book1, book3, book2);


    readers[1].returnBook(3);
    readers[1].returnBook(book1, book3, book2);
    //TODO
    // не выводить последнюю запятую


  }
}

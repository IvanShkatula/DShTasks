package com.academy.homework.classes.task4;

public class Reader {

 /* 4.	Определить класс Reader, хранящий такую информацию о пользователе библиотеки: ФИО, номер читательского билета,
 факультет, дата рождения, телефон. Методы takeBook(), returnBook().
  Разработать программу, в которой создается массив объектов данного класса. Перегрузить методы takeBook(), returnBook():
      - takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
      - takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение
      "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
      - takeBook, который будет принимать переменное количество объектов
      класса Book (создать новый класс, содержащий имя и автора книги).
      Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
  Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги:
  Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".*/

  String fIO;
  int readerId;
  String faculty;
  String birthday;
  int phoneNumber;

  public Reader() {
    super();
  }

  public Reader(String fIO, int readerId, String faculty, String birthday, int phoneNumber) {
    this.fIO = fIO;
    this.readerId = readerId;
    this.faculty = faculty;
    this.birthday = birthday;
    this.phoneNumber = phoneNumber;
  }

  public void takeBook(int booksAmount){
    System.out.println(fIO + " взял " + booksAmount + " книги");
  }

  public void takeBook(String... bookNames){

    StringBuilder books = new StringBuilder();

    for (int i = 0; i < bookNames.length; i++) {
      books.append(bookNames[i]).append(", ");
    }

    System.out.println(fIO + " взял книги: " + books);
  }

  public void takeBook(Book... book){

    StringBuilder books = new StringBuilder();

    for (int i = 0; i < book.length; i++) {
      books.append(book[i].getBookName()).append(", ");
    }

    System.out.println(fIO + " взял книги: " + books);
  }

  public void returnBook(int booksAmount){
    System.out.println(fIO + " вернул " + booksAmount + " книги");
  }

  public void returnBook(Book... book){

    StringBuilder books = new StringBuilder();

    for (int i = 0; i < book.length; i++) {
      books.append(book[i].getBookName()).append(", ");
    }

    System.out.println(fIO + " вернул книги: " + books);
  }

  public String getfIO() {
    return fIO;
  }

  public void setfIO(String fIO) {
    this.fIO = fIO;
  }

  public int getReaderId() {
    return readerId;
  }

  public void setReaderId(int readerId) {
    this.readerId = readerId;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }
}

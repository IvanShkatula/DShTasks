package com.academy.homework.nested_classes;

public class Task2LocalClassesUser {
//записать локальным классом
  /*1.  Создать класс User, содержащий private переменные login, password.
  Создать внутренний класс Query в классе User.
  Класс Query содержит метод printToLog(), который распечатывает на консоль сообщение о том
  что пользователь с таким то логином и паролем отправил запрос.
  Класс User, содержит метод createQuery(), в котором создается объект класса Query и вызывается метод printToLog().
  В методе main(): создать экземпляр класса User и вызвать метод createQuery();
  создать экземпляр класса Query и вызвать метод printToLog()
   используя конструкцию user.new Query();
    создать экземпляр класса Query и вызвать метод printToLog() используя конструкцию new User().new Query();*/

 private String login;
 private String password;

  public Task2LocalClassesUser(String login, String password) {
    this.login = login;
    this.password = password;
  }

  private void createQuery() {
   class Query {
     private void printToLog() {
       System.out.println("Пользователь с логином: " + login + " и паролем: " + password + " отправил запрос");
     }
   }
   Query query = new Query();
   query.printToLog();
 }

  public static void main(String[] args) {
    Task2LocalClassesUser user = new Task2LocalClassesUser("log1", "pass1");
    user.createQuery();

   //  возможно ли создать экземпляр класса Query?
  }

}

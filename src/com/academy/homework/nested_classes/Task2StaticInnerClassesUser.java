package com.academy.homework.nested_classes;

public class Task2StaticInnerClassesUser {
  private static String login;
  private static String password;

  public Task2StaticInnerClassesUser(String login, String password) {
    this.login = login;
    this.password = password;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void createQuery() {
    Task2StaticInnerClassesUser.Query query = new Task2StaticInnerClassesUser.Query();
    query.printToLog();
  }

  public static class Query {
    public void printToLog() {
      System.out.println("Пользователь с логином ; " + Task2StaticInnerClassesUser.login + " и паролем: " + Task2StaticInnerClassesUser.password+".  отправил запрос");
    }
  }


  public static void main(String[] args) {
//    User user = new User("pass", "pass");
//    user.createQuery();

    Query query = new Query();
    query.printToLog();
  }
}

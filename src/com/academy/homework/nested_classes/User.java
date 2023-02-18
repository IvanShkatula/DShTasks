package com.academy.homework.nested_classes;

public class User {

  private String login;
  private String password;

  public User(String login, String password) {
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
    Query query = new Query();
    query.printToLog();
  }

  public class Query {
   public void printToLog() {
     System.out.println("Пользователь с логином ; " + login + " и паролем: " + password+".  отправил запрос");
    }
  }

}

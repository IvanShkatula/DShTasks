package com.academy.homework.nested_classes;

public class Application {
  public static void main(String[] args) {
    User user1 = new User("login1", "password1");
    user1.createQuery();

    user1.new Query().printToLog();
    // User.Query query = new User.Query();
    // - почему просит статик ?
  }
}

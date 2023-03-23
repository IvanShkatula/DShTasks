package com.academy.homework.nested_classes;

import java.util.ArrayList;

public class Account {

 /* 1. Создать класс Account с внутренним классом, с помощью которого можно хранить информацию обо всех операциях со счетом
      (снятие, платежи, поступления)*/

  class Bill{
    ArrayList<String> operations;
  }
}

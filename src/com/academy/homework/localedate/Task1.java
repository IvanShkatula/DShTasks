package com.academy.homework.localedate;

import java.time.LocalDate;

public class Task1 {

  /*1. Практикуем методы LocalDate
  Создайте объект класса LocalDate, указывая дату своего рождения.
  Вывести на консоль день недели, день в году, месяц, год.
  Создайте  объект класса LocalDate, представляющий текущее время.
  Сравните его со своим днем рождения используя методы isAfter(), isBefore().*/

  public static void main(String[] args) {
    LocalDate localDate = LocalDate.of(1989,10,9);
    System.out.println(localDate.getDayOfWeek());
    System.out.println(localDate.getDayOfYear());
    System.out.println(localDate.getMonth());
    System.out.println(localDate.getYear());
    System.out.println(localDate.isAfter(LocalDate.of(2000,10,2)));
    System.out.println(localDate.isBefore(LocalDate.of(2000,10,2)));

  }

}

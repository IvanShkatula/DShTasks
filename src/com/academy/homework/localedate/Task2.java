package com.academy.homework.localedate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Task2 {

  /*2. Практикуем методы LocalDate
  Распечатать график праздников на текущий год используя форматирование.*/

  public static void main(String[] args) {

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    ArrayList<LocalDate> localDates = new ArrayList<>();

    LocalDate localDate = LocalDate.parse("08-03-2023", dateTimeFormatter);
    LocalDate localDate2 = LocalDate.parse("09-03-2023", dateTimeFormatter);
    LocalDate localDate3 = LocalDate.parse("15-03-2023", dateTimeFormatter);
    LocalDate localDate4 = LocalDate.parse("10-03-2023", dateTimeFormatter);
    LocalDate localDate5 = LocalDate.parse("11-03-2023", dateTimeFormatter);

    localDates.add(localDate);
    localDates.add(localDate2);
    localDates.add(localDate3);
    localDates.add(localDate4);
    localDates.add(localDate5);

    for (LocalDate localDAte: localDates) {
      System.out.println(localDAte.format(DateTimeFormatter.ISO_DATE));
    }

    System.out.println(localDate.format(DateTimeFormatter.ISO_DATE));
  }
}

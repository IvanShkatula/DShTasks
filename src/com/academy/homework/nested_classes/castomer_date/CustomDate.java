package com.academy.homework.nested_classes.castomer_date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomDate {

  public static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  public static final Pattern PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");
  private Year year;
  private Year.Month month;
  private Year.Month.Day day;

  public CustomDate() {

    String date = enterDate();
    LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
    this.year = new Year(localDate.getYear());
    this.month = this.year. new Month(localDate.getMonthValue());
    this.day = this.month.new Day(localDate.getDayOfMonth());
  }
/*Задание 1.
  Создать класс CustomDate, используя вложенные классы Год, Месяц, День.
  Методы: задать дату, вывести на консоль день недели по заданной дате.
  День недели представить в виде перечисления.
  Рассчитать количество дней, в заданном временном промежутке.
  Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки.
  После валидации в конструкторе создаем объекты класса Year, Month, Day.
  Добавить метод, который проверяет высокосный ли год или нет.*/

  public static void main(String[] args) {
    CustomDate customDate = new CustomDate();
    customDate.enterDate();
  }

  private String enterDate() {
    Scanner scanner = new Scanner(System.in);
    String date = null;
    Matcher matcher = null;
    do {
      date = scanner.next();
      matcher = PATTERN.matcher(date);
    } while (!matcher.matches());

    return date;
  }

  private DayOfWeek returnDayOfWeek() {
    LocalDate localDate = LocalDate.of(year.year, month.month, day.day);
    return localDate.getDayOfWeek();
  }

  class Year {
    private int year;

    public Year(int year) {
      this.year = year;
    }

    class Month {
      private int month;

      public Month(int month) {
        this.month = month;

      }

      class Day {
        private int day;

        public Day(int day) {
          this.day = day;
        }
      }
    }
  }

}

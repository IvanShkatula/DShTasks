package com.academy.homework.nested_classes.castomer_date;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;

public class CustomDate {


  public static void main(String[] args) {
    CustomDate customDate = new CustomDate();
    customDate.enterDate();
  }

  private void enterDate() {
    Scanner scanner = new Scanner(System.in);
    Year year = new Year(scanner.nextInt());

  }

  private void returnDayOfWeek() {

  }

  static class Year {
    private int year;

    public Year(int year) {
      this.year = year;
    }

    static class Month {
      private int month;

      public Month(int month) {
        this.month = month;

      }

      static class Day {
        private int day;

        public Day(int day) {
          this.day = day;
        }
      }
    }
  }

}

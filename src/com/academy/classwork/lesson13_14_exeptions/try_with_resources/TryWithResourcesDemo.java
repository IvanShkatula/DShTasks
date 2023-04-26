package com.academy.classwork.lesson13_14_exeptions.try_with_resources;

import java.util.Scanner;

public class TryWithResourcesDemo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {

    } finally {
      scanner.close();
    }

    try (Scanner scanner1 = new Scanner(System.in)){

    }

    try (AutoclosableDog dog = new AutoclosableDog()){

    }
  }
}

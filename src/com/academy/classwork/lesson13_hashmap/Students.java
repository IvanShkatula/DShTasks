package com.academy.classwork.lesson13_hashmap;

import java.util.HashMap;
import java.util.Map;

public class Students {
  public static void main(String[] args) {
/*    HashMap<Person, Integer> students = new HashMap<>();
    Person vasya = new Person("Vasya", 11);
    students.put(vasya, 10);
    vasya.setAge(12);
    students.put(new Person("Petya", 8), 9);
    students.put(new Person("Olya", 7), 5);

    System.out.println(students.get(vasya));
    System.out.println(students.get(new Person("Petya", 8)));*/


    HashMap<String, Integer> students = new HashMap<>();
    students.put("Petya", 6);
    students.put("Olya", 7);
    students.put("Vasya", 8);

    if (students.containsKey("Petya")) {
      double averageMark = (students.get("Petya") + 8) / 2;
      students.put("Petya", (int) averageMark);
    } else {
      students.put("Petya", 8);
    }

    for (String key : students.keySet()) {
      System.out.println(key);
    }

    for (int value : students.values()) {
      System.out.println(value);
    }

    for (Map.Entry<String, Integer> entry: students.entrySet()) {
      System.out.println(entry);
    }

    for (String key : students.keySet()) {
      System.out.println(key + " " + students.get(key));
    }
  }
}

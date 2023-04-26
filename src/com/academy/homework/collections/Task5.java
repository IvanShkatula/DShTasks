package com.academy.homework.collections;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.academy.homework.classes.task4.Reader;

public class Task5 {

 /* Задача 5.
  Можно писать все в main. Не нужно создавать новых классов.
  Имеется текст. Следует составить для него частотный словарь:
  Создать Map<Character, Integer> для символов, в который мы заносим символ и его количество.*/

  public static void main(String[] args) {
    Map<Character, Integer> map = new HashMap<>();
    String text = "aaaabbbbc";

     char[] chars = text.toCharArray();

    for (int i = 0; i < chars.length; i++) {
       if (map.containsKey(chars[i])) {
           int value = map.get(chars[i]);
           map.put(chars[i], ++value);
       } else {
           map.put(chars[i], 1);
         }
    }
    System.out.println(map);
  }
}

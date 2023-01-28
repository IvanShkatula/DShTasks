package com.academy.homework.tasks.arrays;

import java.util.Scanner;

public class Task11 {

/*
  Задача 11.
  Пользователь должен указать с клавиатуры чётное положительное число,
  а программа должна создать массив указанного размера из случайных целых чисел из [-5;5] и вывести его на экран в строку.
  После этого программа должна определить и сообщить пользователю о том, сумма модулей какой половины массива больше:
  левой или правой, либо сообщить, что эти суммы модулей равны.
  Если пользователь введёт неподходящее число, то программа должна требовать повторного ввода до тех пор, пока не будет указано корректное значение.
*/

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int num = 1;
    boolean bool = true;
    // почемму я не могу поставить boolean bool = false; ????
    while (bool) {
      num = scanner.nextInt();
      if (num % 2 == 0 && num > 0) {
        bool = false;
      }
    }

    int[] array = new int[num];
    int firstPart = 0;
    int secondPart = 0;


    for (int i = 0; i < num; i++) {
      array[i] = (int) ((Math.random() * 11) - 5);
      if (i < num / 2) {
        firstPart += Math.abs(array[i]);
      } else {
        secondPart += Math.abs(array[i]);
      }
    }

    if (firstPart == secondPart) {
      System.out.println("Обе части равны");
    } else if (firstPart > secondPart){
      System.out.println("Левая часть больше " + firstPart);
    } else {
      System.out.println("Правая часть больше " + secondPart);
    }

  }

}

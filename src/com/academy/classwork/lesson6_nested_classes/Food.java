package com.academy.classwork.lesson6_nested_classes;

import java.util.ArrayList;
import java.util.List;

public class Food {
  public static void main(String[] args) {
   /* Potato potato2 = new Potato() {
      @Override
      public void dig() {
        System.out.println("Копаем картошку");
      }
    };
    Potato potato = new Potato() {
      @Override
      public void peel() {
        specificPeel();
        System.out.println("Чистим картошку в анонимном классе.");
      }

      public void specificPeel() {
        System.out.println("some specific method");
      }

      @Override
      public void dig() {
        // TODO Auto-generated method stub

      }
    };
    potato.peel();
    potato.dig();*/

//		Validator validator = new Validator() {
//			private final Pattern p = Pattern.compile("[a-z]+@gmail.com");
//
//			@Override
//			public Pattern getPattern() {
//				return p;
//			}
//		};

//		System.out.println(validator.isValid("test@gmail.com"));
//		Potato potato = new Potato();
//		potato.peel();
    List<String> list2 = new ArrayList<>();
    List<String> list = new ArrayList<>() {
      public boolean add(String st) {
        System.out.println("Не добавили элемент");
        return true;
      }
    };
    list.add("anyString");
    list.add("anyString2");
    list.add("anyString3");
    System.out.println(list);
  }
}

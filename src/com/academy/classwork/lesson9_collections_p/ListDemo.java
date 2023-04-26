package com.academy.classwork.lesson9_collections_p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ListDemo {

  public static void main(String[] args) {
    //ArrayList<Integer> list = new ArrayList();
    ArrayList<Integer> arrayList2list = new ArrayList();
    LinkedList<Integer> list = new LinkedList();
    List<Integer> list2 = new LinkedList();
    Collection<Integer> collection = new ArrayList<>();

    list2 = arrayList2list;


    System.out.println("Начальный размер ArrayList " + list.size());
    list.add(1);
    list.add(2);
    list.add(6);
    list.add(9);
    list.add(11);

    System.out.println("Конечный размер ArrayList " + list.size());

    System.out.println(list);

    list.add(2, 999);
    System.out.println(list);

    list.add(6, null);
    System.out.println(list);

    System.out.println(list.get(2));

    System.out.println("цикл for");
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i) + " ");
    }

    System.out.println();
    System.out.println("цикл foreach");
    for (Integer i :
        list) {

      System.out.print(i + " ");
    }

    System.out.println();
    String s = list.stream()
        .map(String::valueOf)
        .collect(Collectors.joining("|"));
    System.out.println();

    System.out.println(s);

    System.out.println("list.forEach");
    list.forEach(i -> System.out.print(i + " "));

    System.out.println("iterator");
    System.out.println();
    Iterator<Integer> iterator = list.iterator();
    while (iterator.hasNext()) {

      if (iterator.next() == null) {
        iterator.remove();
      }

    }
    System.out.println(list);



  }


}

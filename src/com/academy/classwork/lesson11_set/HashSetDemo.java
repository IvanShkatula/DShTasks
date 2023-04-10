package com.academy.classwork.lesson11_set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashSetDemo {
  public static void main(String[] args) {
    HashSet<Integer> integerHashSet = new HashSet<>();

    integerHashSet.add(1);
    integerHashSet.add(1);
    integerHashSet.add(3);
    integerHashSet.add(3);
    integerHashSet.add(3);
    integerHashSet.add(4);
    integerHashSet.add(4);
    integerHashSet.add(4);
    integerHashSet.add(4);

  /*  for (Integer i : integerHashSet) {
      System.out.println(i);
    }*/

    Dog dog1 = new Dog("Tysik");
    Dog dog2 = new Dog("Tysik");
    Dog dog3 = new Dog("Bim");

    HashSet<Dog> dogHashSet = new HashSet<>();
    dogHashSet.add(dog1);
    dogHashSet.add(dog2);
    dogHashSet.add(dog3);

  //  System.out.println(dogHashSet);

    LinkedHashSet<Dog> dogLinkedHashSet = new LinkedHashSet<>();
    Dog dog11 = new Dog("Tysik");
    Dog dog22 = new Dog("Tysik");
    Dog dog33 = new Dog("Bim");
    Dog dog44 = new Dog("Bars");

    dogLinkedHashSet.add(dog11);
    dogLinkedHashSet.add(dog22);
    dogLinkedHashSet.add(dog33);
    dogLinkedHashSet.add(dog44);

  //  System.out.println(dogLinkedHashSet);

    /*Comparator<Dog> dogComparatorByNickName = new Comparator<Dog>() {
      @Override
      public int compare(Dog o1, Dog o2) {
        return o1.getNickName().compareTo(o2.getNickName());
      }
    };*/

  //  Comparator<Dog> dogComparatorByNickName =  (Dog o1, Dog o2) -> o1.getNickName().compareTo(o2.getNickName());

    Comparator<Dog> dogComparatorByNickName = Comparator.comparing(Dog::getNickName);

    TreeSet<Dog> dogTreeSet = new TreeSet<>(dogComparatorByNickName);
 //   TreeSet<Dog> dogTreeSet = new TreeSet<>();
    Dog dogTree1 = new Dog("Tysik", 1);
    Dog dogTree2 = new Dog("Tysik", 2);
    Dog dogTree3 = new Dog("Bim",2);
    Dog dogTree4 = new Dog("Tysik", 3);

    dogTreeSet.add(dogTree1);
    dogTreeSet.add(dogTree2);
    dogTreeSet.add(dogTree3);
    dogTreeSet.add(dogTree4);

 //   System.out.println(dogTreeSet);


    //    SortedSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
//      int i = 0;
//
//      @Override
//      public int compare(String o1, String o2) {
////        System.out.println("compare" + i);
//        return i--;
//      }
//    });

    SortedSet<String> treeSet = new TreeSet<>();
    treeSet.add("Минск");
    treeSet.add("Брест");
    treeSet.add("Могилев");
    treeSet.add("Гродно");
    treeSet.add("Гомель");
    treeSet.add("Минск");

    System.out.println(treeSet);

    SortedSet<String> subSet = treeSet.subSet("Гомель", "Могилев");
    System.out.println("SubSet: " + subSet);

    System.out.println("HeadSet: " + treeSet.headSet("Минск"));
    System.out.println("TailSet: " + treeSet.tailSet("Минск"));
    System.out.println("Первый элемент: " + treeSet.first());
    System.out.println("Последний элемент: " + treeSet.last());
  }
}

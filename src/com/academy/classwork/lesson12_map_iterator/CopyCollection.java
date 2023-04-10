package com.academy.classwork.lesson12_map_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.academy.classwork.lesson11_set.Dog;

public class CopyCollection {
  public static void main(String[] args) {
    ArrayList<Dog> dogs = new ArrayList<>();
    Dog dog1 = new Dog("n1", 1);
    Dog dog2 = new Dog("n2", 1);
    Dog dog3 = new Dog("n3", 1);
    dogs.add(dog1);
    dogs.add(dog2);
    dogs.add(dog3);

    LinkedList<Dog> dogLinkedList = new LinkedList<>((Collection)dogs);
   // Collections.copy(dogLinkedList, dogs);
    dogLinkedList.get(0).setAge(17);


    System.out.println(dogs.get(0).getAge());
  }
}

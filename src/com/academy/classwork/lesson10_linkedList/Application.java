package com.academy.classwork.lesson10_linkedList;

public class Application {

  public static void main(String[] args) {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    linkedListCustom.print();

//    linkedListCustom.add(2);
//    linkedListCustom.add(10);
//    linkedListCustom.add(20);

    linkedListCustom.print();

    linkedListCustom.add(0, 999);
    linkedListCustom.add(0, 998);
    linkedListCustom.add(2, 1000);

    linkedListCustom.print();

  }

}

package com.academy.classwork.lesson10_linkedList;

public class Application {

  public static void main(String[] args) {
    LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();
    linkedListCustom.print();

//    linkedListCustom.add(2);
//    linkedListCustom.add(10);
//    linkedListCustom.add(20);

    linkedListCustom.print();

    linkedListCustom.add(0, 996);
    linkedListCustom.add(0, 995);
    linkedListCustom.add(2, 999);
    linkedListCustom.add(2, 998);
    linkedListCustom.add(2, 997);
    linkedListCustom.add(5, 1000);

    linkedListCustom.removeFirst();
//    linkedListCustom.removeLast();
//    linkedListCustom.remove(0);
 //   linkedListCustom.remove(2);

    linkedListCustom.print();
    for (int i = 0; i < linkedListCustom.size(); i++) {
      System.out.println(linkedListCustom.get(i));
    }


  }

}

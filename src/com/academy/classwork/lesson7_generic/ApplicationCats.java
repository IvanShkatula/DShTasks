package com.academy.classwork.lesson7_generic;

public class ApplicationCats {

  public static void main(String[] args) {
    Cat[] cats = {new Cat("Barsik"), new Cat("Myrzik"), new Cat("Vaska")};
    CatBox catBox = new CatBox(cats);

    System.out.println(catBox.getCatByIndex(1));

//    Box<Cat> cats2 = new Box<>(cats);
//    System.out.println(cats2.getItem(1));


    Integer[] intsArray = {1 , 1, 3};
    Box<Integer, String, Cat> integerBox = new Box<>(intsArray);

  /*  Double[] arrayDouble = {1.0, 2.0};
    Box<Double> doubleBox = new Box<>(arrayDouble);

    Double[] arrayDouble2 = {1.0, 5.0, 3.0};
    Box<Double> doubleBox2 = new Box<>(arrayDouble2);

  //  integerBox = doubleBox;

//    System.out.println(doubleBox2.max());

    System.out.println( doubleBox.average());
    System.out.println( doubleBox2.average());

    System.out.println(doubleBox.isSameAverage(doubleBox2));
*/
//    System.out.println(integerBox.isSameAverage(doubleBox2));
  }


}

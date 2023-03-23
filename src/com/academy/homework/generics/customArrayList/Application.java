package com.academy.homework.generics.customArrayList;

public class Application {

  public static void main(String[] args) throws Exception {
    CustomArrL customArrL = new CustomArrL(2);
    System.out.println(customArrL.getArrayLength());
    System.out.println(customArrL.getLastIndex());
    customArrL.add(1);
    customArrL.add(2);
    customArrL.add(3);
    customArrL.add(2);
    System.out.println(customArrL.getArrayLength());
    System.out.println(customArrL.getLastIndex());

    Integer t = 2;

    customArrL.remove(t);
    System.out.println(customArrL.getArrayLength());
    System.out.println(customArrL.getLastIndex());

    System.out.println(customArrL.get(1));
    System.out.println(customArrL.get(3));

//    customArrL.remove(2);
//    System.out.println(customArrL.getArrayLength());
//    System.out.println(customArrL.getLastIndex());
//
//    customArrL.remove(2);
//    System.out.println(customArrL.getArrayLength());
//    System.out.println(customArrL.getLastIndex());

 //   customArrL.get(9);

 //   customArrL.remove(-1);
  }

}

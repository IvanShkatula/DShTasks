package com.academy.homework.generics.customArrayList;

public class Application {

  public static void main(String[] args) throws Exception {
    CustomArrL customArrL = new CustomArrL(2);

    customArrL.add(1);
    customArrL.add(2);
    customArrL.add(3);
    customArrL.add(2);

    System.out.println(customArrL.toString());

    customArrL.remove(3);
   // customArrL.remove(3);

    System.out.println(customArrL.toString());


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

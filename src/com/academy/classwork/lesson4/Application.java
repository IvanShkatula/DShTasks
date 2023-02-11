package com.academy.classwork.lesson4;

public class Application {

  public static int weight = 5;
  public int tall = 4;

  public static void main(String[] args) {
    Cat cat1 = new Cat();
    Cat cat2 = new Cat();
    Cat cat3 = new Cat();
    Bird bird1 = new Bird();
    Bird bird2 = new Bird();

    cat1.eat();
    Cat.sleep();
    System.out.println(weight);
    System.out.println();

    Walkable[] walkables = new Walkable[5];

    walkables[0] = cat1;
    walkables[1] = cat2;
    walkables[2] = cat3;
    walkables[3] = bird1;
    walkables[4] = bird2;

    for (Walkable w: walkables) {
      System.out.println(w);
      w.flyLikeSuperman();
    }
    cat2.money = 20.0;
    Cat.money = 30;

        System.out.println(cat2.money);


  }



}

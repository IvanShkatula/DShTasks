package com.academy.classwork.lesson6_nested_classes.examples;

import java.util.Date;

import com.academy.classwork.lesson6_nested_classes.annotation.Version;
@Version(info = "info")
public class Application {
  /* Создать экземпляр класса Food и вызвать его метод prepare().
   На вход метода prepare() передать экземпляр анонимного класса, расширяющего интерфейс Cookable.*/

  public static void main(String[] args) {
    Food food = new Food();
    food.prepare(new Cookable() {
      @Override
      public void cook(String str) {
        System.out.println("мы готовим " + str);
      }
    }, "блюдо");
    Object i = 5;

    String s = (String) i;
    new Integer(1);
  }
  @SuppressWarnings("deprecation")
  public void useDeprecatedMethod() {
    Date date = new Date();
    date.setDate(5);
  }

}

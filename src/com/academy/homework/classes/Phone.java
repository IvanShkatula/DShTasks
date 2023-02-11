package com.academy.homework.classes;

public class Phone {

  /*1.	Класс Phone.
  a) Создайте класс Phone, который содержит переменные number, model и weight.
  б) Создайте три экземпляра этого класса.
  в) Выведите на консоль значения их переменных.
  г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
    getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
  д) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
  е) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
  ж) Добавить конструктор без параметров.
  з) Вызвать из конструктора с тремя параметрами конструктор с двумя.
  и) Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
  к) Создать метод sendMessageс аргументами переменнойx длины(varargs). Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
  л) Изменить класс Phone в соответствии с концепцией JavaBean.*/

  private int number;
  private String model;
  private int weight;

  public Phone() {

  }

  public Phone(int number, String model) {
    this.number = number;
    this.model = model;
  }

  public Phone(int number, String model, int weight) {
    this(number, model);
    this.weight = weight;
  }

  public static void main(String[] args) {
    Phone phone1 = new Phone();
    Phone phone2 = new Phone();
    Phone phone3 = new Phone();

    System.out.println(phone1.getNumber());

    /*System.out.println(phone1);
    System.out.println(phone2);
    System.out.println(phone3);*/
  }

  private void receiveCall(String name) {
    System.out.println("Звонит " + name);
  }

  private void receiveCall(String name, int number) {
    System.out.println("Звонит " + name + "его номер " + number);
  }

  private void sendMessageс(Integer... phoneNumbers) {
    for (int num : phoneNumbers) {
      System.out.println(num);
    }
  }

  private int getNumber() {
    return number;
  }


  public void setNumber(int number) {
    this.number = number;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "Phone{" +
        "number=" + number +
        ", model='" + model + '\'' +
        ", weight=" + weight +
        '}';
  }
}

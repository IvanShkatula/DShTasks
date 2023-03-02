package com.academy.homework.generics.task6;

public class Task6TVK<T, V, K> {

  /*а) Создать обобщенный класс с тремя параметрами (T, V, K).
  Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход параметры типа (T, V, K),
  методы возвращающие значения трех переменных. Создать метод, выводящий на консоль имена классов для трех переменных класса.
  б) Наложить ограничения на параметры типа: T должен реализовать интерфейс Comparable (классы-оболочки, String),
  V должен реализовать интерфейс Serializable и расширять класс Animal, K должен расширять класс Number.*/

  private T variableT;
  private V variableV;
  private K variableK;

  public Task6TVK(T variableT, V variableV, K variableK) {
    this.variableT = variableT;
    this.variableV = variableV;
    this.variableK = variableK;
  }

  public void printClasses() {
    System.out.println(variableT.getClass().getSimpleName());
    System.out.println(variableV.getClass().getSimpleName());
    System.out.println(variableK.getClass().getSimpleName());
  }

  public T getVariableT() {
    return variableT;
  }

  public void setVariableT(T variableT) {
    this.variableT = variableT;
  }

  public V getVariableV() {
    return variableV;
  }

  public void setVariableV(V variableV) {
    this.variableV = variableV;
  }

  public K getVariableK() {
    return variableK;
  }

  public void setVariableK(K variableK) {
    this.variableK = variableK;
  }
}

package com.academy.homework.generics.customArrayList;

import java.util.Arrays;

public class CustomArrL<T> {

/*  Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
  Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
  Содержит конструктор, принимающий значение int и инитает им размер нашего массива.

  Содержит методы:
1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
2) взятие по индексу get(int i)
3) взятие последнего элемента getLast()
4) взятие первого элемента getFirst()
5) вывод размера массива
6) вывод индекса последнего заполненого элемента (не путать с размерностью)
7) удаление элемента по индексу (remove(int i)
8) удаление элемента по значению (remove(T obj))*/

  private T[] arrayT;
  private int index = 0;

  public CustomArrL() {
    arrayT = (T[]) new Object[16];
  }

  public CustomArrL(int size) {
    arrayT = (T[]) new Object[size];
  }

  public void add(T obj) {

    if (index >= arrayT.length) {
      arrayT = Arrays.copyOf(arrayT, arrayT.length * 2 + 1);
    }
    arrayT[index] = obj;
    index++;
  }

  public T get(int i) throws Exception {
    if (index < i || i < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arrayT[i];
  }

  public T getLast() {
    return arrayT[index];
  }

  public T getFirst() {
    return arrayT[0];
  }

  public int getArrayLength() {
    return arrayT.length;
  }

  public int getLastIndex() {
    return index;
  }

  public void remove(int i) {
    if (i > index || i < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    for (int j = 0; j < index; j++) {
      if (j > i)
        arrayT[j - 1] = arrayT[j];
    }
    index--;
  }

  public void remove(T obj) {
    for (int i = 0; i < index; i++) {
      if (arrayT[i].equals(obj)) {
        for (int j = i; j < index; j++) {
          arrayT[j] = arrayT[j+1];
        }
        index--;
      }
    }
  }

  public T[] getArrayT() {
    return arrayT;
  }

  public void setArrayT(T[] arrayT) {
    this.arrayT = arrayT;
  }
}

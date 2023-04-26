package com.academy.homework.collections;

import java.util.Iterator;

public class Task3<T> implements Iterator<T> {

  private T[][] array;
  private int i;
  private int j;

  public Task3(T[][] array) {
    this.array = array;
  }

  @Override
  public boolean hasNext() {
    return i < array.length && j < array[i].length;
  }

  @Override
  public T next() {
    T k = array[i][j++];
    if (j >= array[i].length) {
      i++;
      j = 0;
    }
    return k;
  }
}

/*
  Задача 3.
  Написать итератор по двумерному массиву. (Отдельный класс. Наследуемся от Iterator<T>)
  Протестировать в main.
*/



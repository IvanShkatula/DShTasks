package com.academy.classwork.lesson12_map_iterator;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {

  private T[] array;
  int index = -1;

  public ArrayIterator(T[] array) {
    this.array = array;
  }

  @Override
  public boolean hasNext() {
    return index + 1 < array.length && array[index + 1] != null;

//   аналогичная запись
//    if (index >= array.length) {
//      return false;
//    }
//    if (array[index] != null) {
//      return true;
//    }
//    return false;
  }

  @Override
  public T next() {
    return array[++index];
  }

  @Override
  public void remove() {
    int i = findLastIndex();
    System.arraycopy(array, index + 1, array, index, array.length - index - 1);
    array[i] = null;

  }

  private int findLastIndex() {
    int count = 0;
    for (int i = array.length - 1; array[i] == null; i--) {
      count++;
    }
    return array.length - count - 1;
  }
}

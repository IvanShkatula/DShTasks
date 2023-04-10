package com.academy.classwork.lesson12_map_iterator;

import java.util.Iterator;
//iterator на двумерный массив
public class Box<T> implements Iterable<T>{
  private T[] array;


  public Box(T[] array) {
    this.array = array;
  }

  @Override

  public Iterator<T> iterator() {
    return new Iterator<T>() {
      int index = 0;
      @Override
      public boolean hasNext() {
        return index < array.length;
      }

      @Override
      public T next() {
        return array[index++];
      }
    };
  }
}

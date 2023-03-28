package com.academy.classwork.lesson10_linkedList;

public class LinkedListCustom<T> {

  // getNode добавить метод - по индексу берет Node

  private Node head;
  private Node tail;
  private int size;

  public int size() {
    return size;
  }

  public T get(int index) {
    if (index >= size || index < 0) {
      System.out.println("index out of bound");
      return null;
    }
    Node current = head;
    int counter = 0;
    while (current != null) {
      if (counter == index) {
        return current.value;
      }
      current = current.next;
      counter++;
    }
    return null;
  }

  public void add(T value) {
    if (head == null) {
      addFirstElement(value);
      size++;
      return;
    }
    Node node = new Node(value, null, tail);
    tail.next = node;
    tail = node;
    size++;
  }

  public void add(int index, T value) {

    Node current = head;
    int counter = 0;

    if (index < 0 || size + 1 < index) {
      System.out.println("index out of bound");
      return;
    }
    if (head == null) {
      addFirstElement(value);
      size++;
      return;
    }

    if (index == 0) {
      Node node = new Node(value, current, null);
      node.next.prev = node;
      node.next.next = null;
      head = node;
      size++;
      return;
    }

    while (current != null) {
      if (counter + 1 == index) {
        Node node = new Node(value, current.next, current);
        Node next = current.next;
        if (next != null) {
          next.prev = node;
        }
        if (next == null) {
          tail = node;
        }
        current.next = node;
        size++;
        return;
      }
      current = current.next;
      counter++;
    }

  }

  private void addFirstElement(T value) {
    Node node = new Node(value, null, null);
    head = node;
    tail = node;
  }

  public void print() {
    Node current = head;

    while (current != null) {
      System.out.print(current.value);
      if (!current.equals(tail)) {
        System.out.print(" ");
      }
      current = current.next;

    }
    System.out.println();
  }

  class Node {
    T value;
    Node next;
    Node prev;

    public Node(T value, Node next, Node prev) {
      this.value = value;
      this.next = next;
      this.prev = prev;
    }
  }
}

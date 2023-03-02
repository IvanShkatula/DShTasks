package com.academy.classwork.lesson7_generic;

public class CatBox {

  private Cat[] cats;

  public CatBox(Cat[] cats) {
    this.cats = cats;
  }

  public Cat getCatByIndex(int index) {
    if (index < 0 || index >= cats.length) {
      return null;
    }
    return cats[index];
  }

  public Cat[] getCats() {
    return cats;
  }

  public void setCats(Cat[] cats) {
    this.cats = cats;
  }
}

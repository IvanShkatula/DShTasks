package com.academy.classwork.lesson8_enum;

public enum CoffeeSizeEnum {
  BIG(20) {
    @Override
    public void test() {
      System.out.println(BIG + " coffee");
    }
  },
  HUGE(50) {
    @Override
    public void test() {
      System.out.println(HUGE + " coffee");
    }
  },
  OVERWHELMING(70) {
    @Override
    public void test() {
      System.out.println(OVERWHELMING + " coffee");
    }
  };

  private int size;
  private int size2;

  CoffeeSizeEnum(int size) {
    this.size = size;
  }

  public int getSize() {
    return size;
  }

  public abstract void test();
}

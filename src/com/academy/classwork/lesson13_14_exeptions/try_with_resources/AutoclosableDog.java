package com.academy.classwork.lesson13_14_exeptions.try_with_resources;

import java.io.Closeable;

public class AutoclosableDog implements Closeable {
  @Override
  public void close() {
    System.out.println("dog closed");
  }
}

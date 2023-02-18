package com.academy.homework.recursion;

public class Task3 {
    public static int recursion(int n, int i) {
      if (n == 0) {
        return i;
      }
      return recursion( n/10, i*10 + n%10 );
    }
    public static void main(String[] args) {
      System.out.println(recursion(158, 0));
    }

}

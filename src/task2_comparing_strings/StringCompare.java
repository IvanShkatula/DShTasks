package task2_comparing_strings;

import java.util.ArrayList;
import java.util.Iterator;

public class StringCompare {

  public static void main(String[] args) {
    StringCompare.stringCompare("asd Rewq", "qweR dsa");
  }

  public static void stringCompare(String firstString, String secondString) {

    if (firstString.length() != secondString.length()) {
      System.out.println("Strings are different");
      return;
    }

    ArrayList<Character> firstArray = new ArrayList<>();
    ArrayList<Character> secondArray = new ArrayList<>();

    addCharsToArrayList(firstString, firstArray);
    addCharsToArrayList(secondString, secondArray);

    Iterator<Character> stringIterator = firstArray.iterator();
    Iterator<Character> stringIterator2 = secondArray.iterator();

    while (stringIterator.hasNext()) {
      char next1 = stringIterator.next();
      stringIterator2 = secondArray.iterator();
      while (stringIterator2.hasNext()) {
        char next2 = stringIterator2.next();
        if (next1 == next2) {
          stringIterator.remove();
          stringIterator2.remove();
          break;
        }
      }
    }
    if (firstArray.isEmpty() && secondArray.isEmpty()) {
      System.out.println("String 1 is a transposition of string 2");
    } else {
      System.out.println("Strings are different");
    }
  }

  private static void addCharsToArrayList(String string, ArrayList<Character> array) {
    for (char c : string.toCharArray()) {
      array.add(c);
    }
  }

}




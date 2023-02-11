package com.academy.homework.classes.task6;

public class Application {

  public static void main(String[] args) {

    Student student1 = new Student("First", "Last", "21354", 5);
    Student student2 = new Student("First2", "Last2", "32143", 4.9);
    Student aspirant1 = new Aspirant("Asp1", "AspL", "987", 5, "Animals");
    Student aspirant2 = new Aspirant("Asp2", "Asp2L", "887", 4.9, "Birds");

    Student[] students = new Student[4];

    students[0] = student1;
    students[1] = student2;
    students[2] = aspirant1;
    students[3] = aspirant2;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].getScholarship());
    }

  }


}

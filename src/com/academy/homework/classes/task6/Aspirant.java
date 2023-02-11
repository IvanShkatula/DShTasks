package com.academy.homework.classes.task6;

public class Aspirant extends Student{

  private String scienceWork;

  public Aspirant() {
  }

  public Aspirant(String firstName, String lastName, String group, double averageMark, String scienceWork) {
    super(firstName, lastName, group, averageMark);
    this.scienceWork = scienceWork;
  }

  public double getScholarship() {
    if (super.getAverageMark() == 5) {
      return 200;
    }
    return 180;
  }

  public String getScienceWork() {
    return scienceWork;
  }

  public void setScienceWork(String scienceWork) {
    this.scienceWork = scienceWork;
  }
}

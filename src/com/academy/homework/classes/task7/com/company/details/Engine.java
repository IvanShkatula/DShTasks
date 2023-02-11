package com.academy.homework.classes.task7.com.company.details;

public class Engine {
  private int power;
  private int kpd;

  public Engine(int power, int kpd) {
    this.power = power;
    this.kpd = kpd;
  }

  public int getPower() {
    return power;
  }

  public void setPower(int power) {
    this.power = power;
  }

  public int getKpd() {
    return kpd;
  }

  public void setKpd(int kpd) {
    this.kpd = kpd;
  }

  @Override
  public String toString() {
    return "Engine{" +
        "power=" + power +
        ", kpd=" + kpd +
        '}';
  }
}

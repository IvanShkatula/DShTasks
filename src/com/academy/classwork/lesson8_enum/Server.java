package com.academy.classwork.lesson8_enum;

import com.academy.classwork.lesson4.Flyable;

public enum Server implements Flyable {
  PRODUCTION("faceBookUrl", "epamUrl"),
  TEST("faceBookUrlTest", "epamUrlTest") {
    @Override
    public void fly() {
      System.out.println("Тест не летает");
    }
  };

  private String facebookUrl;
  private String epamUrl;

  Server(String facebookUrl, String epamUrl) {
    this.facebookUrl = facebookUrl;
    this.epamUrl = epamUrl;
  }

  public String getFacebookUrl() {
    return facebookUrl;
  }

  public void setFacebookUrl(String facebookUrl) {
    this.facebookUrl = facebookUrl;
  }

  public String getEpamUrl() {
    return epamUrl;
  }

  public void setEpamUrl(String epamUrl) {
    this.epamUrl = epamUrl;
  }

  @Override
  public void fly() {
    System.out.println("все летают");
  }
}

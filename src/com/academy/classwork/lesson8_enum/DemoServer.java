package com.academy.classwork.lesson8_enum;

public class DemoServer {
  public static void main(String[] args) {
    process(Server.PRODUCTION);
    Server.TEST.fly();
  }

  public static void process(Server server) {
    System.out.println("Мф работаем с url " + server.getEpamUrl() + " " + server.getFacebookUrl() + " " + server.name());
    server.fly();
  }

}

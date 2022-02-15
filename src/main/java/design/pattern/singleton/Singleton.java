package design.pattern.singleton;

public class Singleton {

  public static void main(String[] args) {

    LoggerConfig configOne = LoggerConfig.getInstance();
    LoggerConfig configTwo = LoggerConfig.getInstance();
    System.out.println("configOne = " + configOne);
    System.out.println("configTwo = " + configTwo);
  }
}

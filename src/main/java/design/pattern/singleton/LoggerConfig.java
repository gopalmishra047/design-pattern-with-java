package design.pattern.singleton;

public class LoggerConfig {

  private static volatile LoggerConfig instance;

  private LoggerConfig() {}

  public static LoggerConfig getInstance() {
    if (instance == null) {
      synchronized (LoggerConfig.class) {
        if (instance == null) {
          instance = new LoggerConfig();
        }
      }
    }
    return instance;
  }
}

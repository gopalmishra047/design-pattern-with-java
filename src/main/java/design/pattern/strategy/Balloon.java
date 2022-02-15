package design.pattern.strategy;

public class Balloon extends ScoreBoardBase {

  @Override
  public int calculateScore(int taps, int multiplier) {
    return (taps * multiplier) + 20;
  }
}

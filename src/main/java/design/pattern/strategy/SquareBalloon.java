package design.pattern.strategy;

public class SquareBalloon extends ScoreBoardBase {

  @Override
  public int calculateScore(int taps, int multiplier) {
    return (taps * multiplier) + 40;
  }
}

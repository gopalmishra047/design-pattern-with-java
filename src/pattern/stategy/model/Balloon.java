package pattern.stategy.model;

import pattern.stategy.ScoreBoardBase;

public class Balloon extends ScoreBoardBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 20;
    }
}

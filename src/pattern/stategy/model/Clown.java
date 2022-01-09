package pattern.stategy.model;

import pattern.stategy.ScoreBoardBase;

public class Clown extends ScoreBoardBase {

    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 10 ;
    }
}

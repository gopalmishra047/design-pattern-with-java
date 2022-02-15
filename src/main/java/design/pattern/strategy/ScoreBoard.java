package design.pattern.strategy;

public class ScoreBoard {

    protected ScoreBoardBase scoreBoardBase;

    public int showScore(int taps, int multiplier){
        return scoreBoardBase.calculateScore(taps, multiplier);

    }
}

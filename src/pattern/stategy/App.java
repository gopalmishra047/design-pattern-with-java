package pattern.stategy;

import pattern.stategy.model.Balloon;
import pattern.stategy.model.Clown;
import pattern.stategy.model.SquareBaloon;

public class App {

    public static void main(String[] args) {

        ScoreBoard scoreBoard = new ScoreBoard();
        scoreBoard.scoreBoardBase = new Balloon();
        int score = scoreBoard.showScore(10, 5);
        System.out.println("scoreBoard Balloon = " + score);


        scoreBoard.scoreBoardBase = new Clown();
        int score1 = scoreBoard.showScore(20, 4);
        System.out.println("scoreBoard clown = " + score1);


        scoreBoard.scoreBoardBase = new SquareBaloon();
        int score2 = scoreBoard.showScore(8, 7);
        System.out.println("scoreBoard square balloon= " + score2);


    }
}

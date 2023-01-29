package AnswerInfo;

import java.util.ArrayList;

public class BaseBallInfo {
    private ArrayList<Character> answer;
    private int strike;
    private int ball;

    public ArrayList<Character> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<Character> answer) {
        this.answer = answer;
    }

    public int getStrike() {
        return strike;
    }

    public void setStrike(int strike) {
        this.strike = strike;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }
}

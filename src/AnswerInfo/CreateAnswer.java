package AnswerInfo;

import AnswerInfo.BaseBallInfo;

import java.util.ArrayList;

public class CreateAnswer {
    public static void create(BaseBallInfo bbc) {
        ArrayList<Character> answer = new ArrayList<>();

        // 0~9 각 자릿수가 안겹치게 리스트에 담기
        for (int i = 0; i < 3; i++) {
            while (true) {
                int num = (int) (Math.random() * 10);  //0~9 각 자리수
                if (answer.contains((char) (num + '0')))
                    continue;
                answer.add((char) (num + '0'));
                break;
            }
        }
        bbc.setAnswer(answer);
    }
}

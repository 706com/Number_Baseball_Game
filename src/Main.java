import AnswerInfo.BaseBallInfo;
import AnswerInfo.CreateAnswer;
import AnswerInfo.ViewAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// <해야 할 일>
// 예외처리
// 함수쪼개기
// mvc 패턴 활용해보기..... , controller , service 등 이용...?
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        //객체생성
        BaseBallInfo bbc = new BaseBallInfo();

        //객체 안에answer값 생성
        CreateAnswer.create(bbc);

        //answer 리스트 결과 확인
        ViewAnswer.view(bbc);


        // 게임시작
        // 3 strike 뜨면 종료
        do{
            bbc.setStrike(0);       //strike 초기화
            bbc.setBall(0);         //ball 초기화

            String myAnswer = br.readLine();
            CheckAnswer.check(myAnswer, bbc);       //입력한 값이랑 객체 넘기기

            if(bbc.getStrike()==0 && bbc.getBall()==0){
                System.out.println("nothing");
            }
            else{
                System.out.println("strike " + bbc.getStrike());
                System.out.println("ball " + bbc.getBall());
            }

        }while(bbc.getStrike() != 3);
    }

}


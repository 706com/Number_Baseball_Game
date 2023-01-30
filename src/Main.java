import AnswerInfo.BaseBallInfo;
import AnswerInfo.CreateAnswer;
import AnswerInfo.ViewAnswer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// <해야 할 일>
// 예외처리
// 함수쪼개기
// mvc 패턴 활용해보기..... , controller , service 등 이용...? (mvc 지식 부족)

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        // 컴퓨터 객체생성
        BaseBallInfo bbc = new BaseBallInfo();

        //객체 안에 answer값 생성
        CreateAnswer.create(bbc);

        //answer 리스트 결과 확인
        ViewAnswer.view(bbc);


        // 게임시작
        // 3 strike 뜨면 종료
        do{
            bbc.setStrike(0);       //strike 초기화
            bbc.setBall(0);         //ball 초기화
            String myAnswer = br.readLine();        //값 입력. (띄어쓰기없이)
//            try {
//                myAnswer = Integer.parseInt(br.readLine());
//            }
//            catch(NumberFormatException e){
//                System.out.println("숫자 형식이 아닙니다.");
//            }
//            finally {
//            }

            CheckAnswer.check(myAnswer, bbc);       //입력한 값이랑 객체 넘기기

            // 0s ,0b 이면 nothing 출력
            if(bbc.getStrike()==0 && bbc.getBall()==0){
                System.out.println("nothing");
            }
            // 하나라도 맞은게 있으면 strike,ball 출력
            else{
                System.out.println("strike " + bbc.getStrike());
                System.out.println("ball " + bbc.getBall());
            }

        }while(bbc.getStrike() != 3);
    }

}


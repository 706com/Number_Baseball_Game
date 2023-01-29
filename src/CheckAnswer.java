import AnswerInfo.BaseBallInfo;

public class CheckAnswer {
    public static BaseBallInfo check(String check, BaseBallInfo bbc) {

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < bbc.getAnswer().size(); i++) {
            char c = check.charAt(i);

            for(int j=0; j<bbc.getAnswer().size(); j++){
                //같은 수가 같은 자리에 있으면 스트라이크
                if(bbc.getAnswer().contains(c) && c==bbc.getAnswer().get(i)){
                    strike++;
                    break;
                }
                //다른 자리에 있으면 볼
                else if(bbc.getAnswer().contains(c) && c!=bbc.getAnswer().get(i)){
                    ball++;
                    break;
                }
            }
        }
        bbc.setStrike(strike);
        bbc.setBall(ball);
        return bbc;
    }
}

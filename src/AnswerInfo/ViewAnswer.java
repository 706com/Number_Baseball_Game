package AnswerInfo;

import AnswerInfo.BaseBallInfo;

public class ViewAnswer {
    public static void view(BaseBallInfo bbc){
        for(int i=0; i<3; i++) {
            System.out.print((bbc.getAnswer().get(i)+" "));
        }
    }
}

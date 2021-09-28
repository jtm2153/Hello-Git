package com.jtm9;

public class Sorce {
    //thorows抛出自定义异常
    public void checksorce(int score) throws ScoreException{
        if(score > 100 || score < 0){
            //抛出异常
            throw new ScoreException("分数应在0--100之间");
        }else{
            System.out.println("分数正确!");
        }
    }
}

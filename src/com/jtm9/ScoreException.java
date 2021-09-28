package com.jtm9;

public class ScoreException extends Exception{
    //自定义异常继承Exception
    public ScoreException(){}
    //有参用以提示
    public ScoreException(String message){
        super(message);
    }
}

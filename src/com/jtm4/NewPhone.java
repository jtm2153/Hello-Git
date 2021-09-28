package com.jtm4;

public class NewPhone extends Phone {
    @Override
    public void call(String name){
        System.out.println("打开视频");
        super.call("老婆");
    }
}

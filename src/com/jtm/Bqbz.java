package com.jtm;

public class Bqbz {
    public static void main(String[] args) {
        //百钱白鸡
        for(int x = 0;x <= 25;x++){
            for(int y = 0;y <= 33;y++){
                int z = 100 - x - y;
                if(z % 3 ==0 && 5*x + 3*y + z/3 == 100){
                    System.out.println("公鸡："+ x +"只,母鸡："+ y +"只,雏鸡："+ z +"只");
                }
            }
        }
    }
}

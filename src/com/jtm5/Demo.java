package com.jtm5;

public class Demo {
    public static void main(String[] args) {
        AnimalOp a = new AnimalOp();
        Cat c = new Cat();
        a.useAnimal(c);

        Dog d = new Dog();
        a.useAnimal(d);
    }
}

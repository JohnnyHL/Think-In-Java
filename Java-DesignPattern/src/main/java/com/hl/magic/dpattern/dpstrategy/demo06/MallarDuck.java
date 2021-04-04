package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

public class MallarDuck extends Duck {
    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("外观：绿毛鸭");
    }
}

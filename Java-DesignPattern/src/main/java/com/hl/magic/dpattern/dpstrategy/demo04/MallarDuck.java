package com.hl.magic.dpattern.dpstrategy.demo04;

/**
 * 绿毛鸭
 */
public class MallarDuck extends Duck implements Flayable,Quackable{
    @Override
    public void display() {
        System.out.println("外观：绿毛");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("起飞了，绿毛鸭");
    }
}

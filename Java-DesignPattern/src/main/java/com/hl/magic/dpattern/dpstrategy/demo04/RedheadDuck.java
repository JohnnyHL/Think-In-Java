package com.hl.magic.letcode.dpattern.dpstrategy.demo04;

/**
 * 红毛鸭
 */
public class RedheadDuck extends Duck implements Flayable,Quackable{
    @Override
    public void display() {
        System.out.println("外观：红毛鸭");
    }

    @Override
    public void quack() {
        System.out.println("呱呱叫");
    }

    @Override
    public void fly() {
        System.out.println("红毛鸭子起飞");
    }
}

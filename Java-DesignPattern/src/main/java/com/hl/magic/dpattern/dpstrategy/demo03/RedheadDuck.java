package com.hl.magic.dpattern.dpstrategy.demo03;

/**
 * 红毛鸭
 */
public class RedheadDuck extends Duck {
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

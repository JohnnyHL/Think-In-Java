package com.hl.magic.letcode.dpattern.dpstrategy.demo05;

/**
 * quack接口的一个实现类：鸭子呱呱叫
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("呱呱的叫");
    }
}

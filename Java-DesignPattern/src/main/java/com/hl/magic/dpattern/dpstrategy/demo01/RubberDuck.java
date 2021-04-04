package com.hl.magic.letcode.dpattern.dpstrategy.demo01;

/**
 * 橡皮鸭子
 */
public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}

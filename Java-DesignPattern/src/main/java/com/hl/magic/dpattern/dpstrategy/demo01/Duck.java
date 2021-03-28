package com.hl.magic.dpattern.dpstrategy.demo01;

/**
 * 策略模式--demo01
 * 定义一个抽象鸭子类，作为所有鸭子的父类
 * 将来鸭子数量增多时，直接多写鸭子类就OK了。
 */
public abstract class Duck {

    public abstract void display();

    public void quack(){
        System.out.println("呱呱叫");
    }

    public void swim(){
        System.out.println("游泳");
    }
}

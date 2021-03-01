package com.hl.magic.dp.policy.demo04;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }

    @Override
    public void display() {
        System.out.println("外观：橡皮鸭");
    }

}

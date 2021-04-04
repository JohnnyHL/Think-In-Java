package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱地叫");
    }
}

package com.hl.magic.letcode.dpattern.dpstrategy.demo05;

/**
 * quack接口的一个实现类：鸭子吱吱地叫
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱地叫");
    }
}

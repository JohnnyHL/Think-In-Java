package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

/**
 * 将鸭子叫的行为剥离出来，作为quack接口，提供三种实现类
 * 1.吱吱地叫
 * 2.呱呱地叫
 * 3.啥都不会做，也不会叫，
 */
public interface QuackBehavior {
    void quack();
}

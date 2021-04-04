package com.hl.magic.letcode.dpattern.dpstrategy.demo06;

public class Test01 {
    public static void main(String[] args){
        /**
         * 多态，实例化鸭子
         */
        Duck modelDuck = new ModelDuck();
        /**
         * 调用叫和飞接口
         */
        modelDuck.performQuack();
        modelDuck.performFly();
        /**
         * 实例化叫的方式，让鸭子拥有呱呱叫的方式
         */
        Squeak squeak = new Squeak();
        modelDuck.setQuackBehavior(squeak);
        /**
         * 实例化飞的方式，让鸭子拥有火箭起飞方式
         */
        FlyRocketPowered rocket = new FlyRocketPowered();
        modelDuck.setFlyBehavior(rocket);
    }
}

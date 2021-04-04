package com.hl.magic.letcode.dpattern.dpstrategy.demo04;

/**
 * 策略模式--demo04
 * 需求：改变设计，引入接口
 * 分析：将鸭子的飞和叫的动作定义为接口
 * 步骤：1.抽取fly到Flyable接口
 *      2.抽取quack到Quackable接口
 *      3.需要这两个功能的子类鸭子可以自行去实现
 * 问题：使用接口后发现确实可以实现这么多空实现，但是也暴露了一个问题
 *      会出现重复的代码，试想如果很多鸭子都会同样的飞，那么每只鸭子都要去实现一次同样的fly方法
 *      此时，简单的使用接口将不友好。
 * 解决：在demo05中，我们将进一步优化设计---使用组合的方式
 */
public abstract class Duck {

    public abstract void display();

    public void swim(){
        System.out.println("游泳");
    }

}

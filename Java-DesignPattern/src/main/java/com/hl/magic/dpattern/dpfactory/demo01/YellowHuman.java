package com.hl.magic.letcode.dpattern.dpfactory.demo01;

public class YellowHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("黄色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("黄色人类会大笑");
    }

    @Override
    public void talk() {
        System.out.println("黄色人会说话，一般说的都是双字节");
    }
}

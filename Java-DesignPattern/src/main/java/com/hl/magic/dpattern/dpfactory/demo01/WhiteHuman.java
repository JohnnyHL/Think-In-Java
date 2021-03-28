package com.hl.magic.dpattern.dpfactory.demo01;

/**
 * 白种人
 */
public class WhiteHuman implements Human{
    @Override
    public void laugh() {
        System.out.println("白色人类会哭");
    }

    @Override
    public void cry() {
        System.out.println("白色人类会大笑");
    }

    @Override
    public void talk() {
        System.out.println("白色人类会说话，一般说的都是单字节");
    }
}

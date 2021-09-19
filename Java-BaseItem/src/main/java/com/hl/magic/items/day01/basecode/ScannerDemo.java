package com.hl.magic.items.day01.basecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @Author HL
 * @Date 2021/5/7 21:20
 */
public class ScannerDemo {


    public static void scanner_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Scanner方式接收：");

        //判断是否还有输入
        if (scanner.hasNext()) {
            //输入字符串，
            //String next = sca不包含尾部空格nner.next();
            //System.out.println("输入的数据：" + next);

            //输入字符串，包含字符串
            //String nextLine = scanner.nextLine();
            //System.out.println("输入的数据：" + nextLine);

            //输入整数
            int nextInt = scanner.nextInt();
            System.out.println("输入的整数数据：" + nextInt);
        }
        scanner.close();
    }

    public static void scanner_2(){
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("bufferedReader方式：");
            String readLine = bufferedReader.readLine();
            System.out.println("输入的数据：" + readLine);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        // scanner_1();
        scanner_2();

    }

}

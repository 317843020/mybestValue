package com.suhb.day06;

import java.util.Random;

public class MyRomdom{
    public static void main(String[] args) {
        java.util.Random rd = new Random(2);
//        for (int i = 0; i <20 ; i++) {
//            rd.setSeed(0);
//            System.out.println(rd.nextInt(8));
//        }
        for (int i = 0; i <20 ; i++) {
        //    rd.setSeed(i);
            System.out.println(rd.nextInt(8));
        }


        for (int i = 0; i <30 ; i++) {
            //rd.nextdouble()
            System.out.println(Math.random()*1000);
        }

        //thinking in java , is operator
        double a = 1.39e-43;
        double b = 1.39E-43;
        System.out.println(a-b);
        System.out.println(b);
        System.out.println(a);
        double c = Math.E-a;
        System.out.println(c);
        System.out.println(Math.log(Math.E));

        //移位符
        // << （低位补0）>> (符号为正 高位插入0 符号为负 高位插入1）

        // >>> (无论正负，高位都插入0）

        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toHexString(i));
        i  >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        int bb = 2;
        System.out.println(Integer.toBinaryString(bb));
        System.out.println(Integer.toBinaryString(-bb));

        char aaa = 1;
        char bbb = 2;
        int iiik = 1-aaa;
        System.out.println(iiik);
        char kkk = 1*2;
        char ccc = (char) (aaa*bbb);
        System.out.println("aaa");
        System.out.println(aaa);
        System.out.println("bbb");
        System.out.println(bbb);
        System.out.println("ccc");
        System.out.println(ccc);


    }

}

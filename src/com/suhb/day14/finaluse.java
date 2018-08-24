package com.suhb.day14;

import java.util.Random;

/***
 * final 字段
 * final 参数
 * final 方法
 * final 类
 */

public class finaluse
{
    //定义为static强调只有一份。定义final表明是常量
    public static final Random rand = new Random();
    //不定final
    public static final int i = new Random().nextInt(2);

    public   final  int jj ; //must init in construtor or here

    public static final int jjk;

    static {
        jjk = 2;
    }

    {
        jj = 1;
    }


    public static final String[] a = {"1","2"};
    public static final int[] b = {1,2,3};
    public static final int[][] c = {{1,2,3},{2,3,4}};
    private static  int ii = 2;
    private static  final  int iii = 3;

    private void test(){
        System.out.println("kkk");
    }

    private final void test2(){
        System.out.println("kkklll");
    }

    public static void main(String[] args) {
        b[1]++;
        b[1] = 2;
        //b = new int[2];
        a[1] = "2";
        //a = new String[3];

        c[0] = new int[3];
        //c[0] ={2,3,4} 初始化的时候才能使用这种写法

        ii++;
        //iii++;  字段private 区别很大 。但是对于private修饰的方法


    }


}

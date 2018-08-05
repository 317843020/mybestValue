package com.suhb.day07;

/** thinking in java 5
 *  @author su
 *  @version 2018-8-5
 */
public class MethodOverLoading {

    public static void main(String[] args) {
        f(1, 1);
        f((char)1,(char)1);
        f((char)1,1);

        //ff(1,1);
    }

//    public static void f(char i,char ii){
//        System.out.println("char");
//    }
   public static void f(int i,int ii){
        System.out.println("int");
    }

    public static void ff(char i,char ii){
        System.out.println("ff");

    }
}

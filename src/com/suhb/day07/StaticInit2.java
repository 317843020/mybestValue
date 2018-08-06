//package com.suhb.day07;
//
//class BB{
//    BB(int i){
//        System.out.println("b"+i);
//    }
//    void f1(int i){
//        System.out.println("f1"+i);
//    }
//
//}
//
//class CC{
//    static BB b1 = new BB(1);
//    CC(){
//        System.out.println("cc");
//
//        b2.f1(1);
//    }
//    void f2(int i){
//        System.out.println("f2"+i);
//    }
//    static BB b2 = new BB(2);
//}
//
//class DD{
//    BB b3 = new BB(3);
//    static BB b4 = new BB(4);
//    DD(){
//        System.out.println("dd");
//        b4.f1(2);
//    }
//    void f3(int i){
//        System.out.println("f3"+i);
//
//    }
//    static BB b5 = new BB(5);
//}
//
//public class StaticInit {
//
//    public static void main(String[] args) {
//        //test1();
//    }
//
//
//
//    public static void   test1(){
//        new DD();
//        //b3,dd,f12
//        new DD();
//        //b3,dd,f12
//        b.f2(1);
//        //f21
//        d.f3(1);
//
//        //f31
//    }
//
//
//    static CC b = new CC();
//
//    // b1,b2,cc,f11,
//    static DD d = new DD();
//    //b3,dd.b4,dd.b5ddf12  (错，先静态字段）
//    //b4,b5,b3dd.b5ddf12
//
//}

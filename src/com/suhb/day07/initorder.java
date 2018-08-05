package com.suhb.day07;

class A{
    A(){
        System.out.println("A");
    }
}
class B{
    B(){
        System.out.println("b");
    }
}
class C{
    A a = new A();
    C(){
        System.out.println("C");
    }
    B b = new B();
}

public class initorder {
    A a = new A();
    initorder(){
        System.out.println("initOrder");
    }
    B b = new B();

    public static void main(String[] args) {
        //initorder a = new initorder();
        //变量由于构造方法
        C c = new C();
    }
}

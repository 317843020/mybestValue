package com.suhb.day07;

class Cup{
    Cup(int i){
        System.out.println("cup"+i);
    }

    void f(int i){
        System.out.println("f"+i);
    }
}

class Cups{

    static Cup cup1;
    static Cup cup2;
    static {
        System.out.println("come on"+cup1+cup2);
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    {
        cup1 = new Cup(3);
        cup2 = new Cup(4);
    }
    Cups(){
        System.out.println("cups");
    }

}

public class staticinit3 {
    public static void main(String[] args) {
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    //comeonnull cup1 cup2 cups

    static Cups cups2 = new Cups();
    // cups  (static 块也是进一次）
}

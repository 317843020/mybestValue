package com.suhb.day02;

public class reflect {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
       // mydemoref a = new mydemoref();
        Class a = mydemoref.class;
        System.out.println(a.getMethods());
        mydemoref mydemoref = new mydemoref();
        System.out.println("jjjj");
        //内部类$
        Class<?> mydemoref1 = Class.forName("com.suhb.day02.reflect$mydemoref");
        System.out.println( mydemoref1.getMethods());
       // reflect o = (reflect) a.newInstance();
    //    System.out.println(o);
        mydemoref o1 = (reflect.mydemoref) mydemoref1.newInstance();
        System.out.println(o1);

        //TODO method address is not same

    }

    static class mydemoref {
        private String a="10";
        public  String b = "20";
        public  int a1 = 1;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }

        public String getB() {
            return b;
        }

        public void setB(String b) {
            this.b = b;
        }

        public int getA1() {
            return a1;
        }

        public void setA1(int a1) {
            this.a1 = a1;
        }
    }
}

package com.suhb.day07;

/** this ,static thinking in java 5
 * @author su
 * @version 2018-8-5
 */
public class controtor {

    public int i = 1;

    controtor(){

    }

    controtor(int ii){
        this();
        //this();  can not call two
        System.out.println("controtor");
    }

    public void test(int iii){
        System.out.println(iii);
    }

    public static void main(String[] args) {
        controtor controtor = new controtor(2),controtor1 = new controtor(3);
      //  controtor.test(controtor,222);
       // controtor.test(this,222);
       // controtor1.test(333);
        com.suhb.day07.controtor testref = testref(controtor);
        testref.testnostatic(2);
    }

    public static controtor testref(controtor ac){

        return ac;
    }

    public void testnostatic(int a){
        System.out.println("i am not static");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();

        //下一次垃圾回收，才会真正释放
        //停止-复制 标记-清除 自适应 分代 jit
    }
}

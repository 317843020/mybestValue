package com.suhb.day06;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.PrintStream;
import java.sql.Statement;

/**
 * thinking in java 5
 * @author su
 * @version 2018-8-4
 */
public class initcleanup {
    /*  */
    public static void main(String[] args) {
        testPrint();
    }

    static void testPrint(){
        byte a = 'a';
        byte[] aa = {'a','b'};
        byte[] aaa ={1,2};

        PrintStream out = System.out;

        System.out.println(aa);

        System.out.println(aaa);

       // ByteOutputStream bo = new ByteOutputStream();
        //bo.write(aa);


    }

}

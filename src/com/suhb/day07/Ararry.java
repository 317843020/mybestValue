package com.suhb.day07;

import java.util.Arrays;
import java.util.List;

public class Ararry {

    public static void main(String[] args) {
        Integer[] arrayTest={6,1,9,2,5,7,6,10,6,12};
        //直接创建一个List
        List<Integer> intList = Arrays.asList(5, 7, 9);
        List<Integer> integers = Arrays.asList(arrayTest);

        System.out.println(Arrays.toString(arrayTest));


    }
}

package com.suhb.day01;

import java.util.Observable;
import java.util.Observer;

/***
 * @Author suhb
 * 观察者模式
 */
public class observe {
    public static void main(String[] args) {
        Observer observer = new Observer() {
            @Override
            public void update(Observable o, Object arg) {
                System.out.println("update");
                System.out.println(arg);

            }
        };
        //不同包，继承的方式就能操作protest
        MyObservable observable = new MyObservable();
        observable.addObserver(observer);
        observable.setChanged();
        observable.notifyObservers("上面update的arg");


    }

    public static class  MyObservable extends Observable{
        public void setChanged(){
            super.setChanged();
        }
    }
}

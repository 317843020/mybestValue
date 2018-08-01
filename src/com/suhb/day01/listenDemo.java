package com.suhb.day01;

import java.util.EventListener;
import java.util.EventObject;
import java.util.Vector;

/**
 * @Author suhb
 * jdk监听器 没有提供具体实现。需要自己实现
 */
public class listenDemo {

    public static void main(String[] args) {
        //1.注册监听器
        EvenSource evenSource = new EvenSource();
      //  MyEvenListenr new MyEvenListenr()
        evenSource.addListenr(new EventListener() {
            @Override
            public boolean doEvent(EventObject eventObject) {
                System.out.println("iiiii");
                System.out.println(eventObject.getSource());
                return false;
            }
        });

        evenSource.addListenr(new EventListener() {
            @Override
            public boolean doEvent(EventObject eventObject) {
                System.out.println("kkkkk");
                System.out.println(eventObject.getSource());
                return false;
            }
        });
        evenSource.publishEvent(new EventObject("abc"));
        evenSource.publishEvent(new EventObject("abcd"));

        //2.监听事件
        //3.发布事件
        //4.执行
    }

    public static class EvenSource{
        Vector<EventListener> vector = new Vector<EventListener>();


        public boolean addListenr(EventListener myEvenListenr){
            vector.add(myEvenListenr);
            return true;
        }

        public boolean remove(EventListener myEvenListenr){
            vector.remove(myEvenListenr);
            return  true;
        }

        public boolean publishEvent(EventObject eventObject){
            for (EventListener eventListener:vector) {
                eventListener.doEvent(eventObject);
            }
            return true;
        }
    }
    public    interface    EventListener extends java.util.EventListener{
            public   boolean doEvent(EventObject eventObject);
    }

}

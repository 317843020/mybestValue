package com.suhb.day05;

import java.net.*;
import java.util.Enumeration;

public class Net {

    public static void main(String[] args) throws UnknownHostException, SocketException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        InetAddress address1 = InetAddress.getByName("www.baidu.com");
        System.out.println(address1);
        InetAddress[] addresses = InetAddress.getAllByName("www.baidu.com");
        for (int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i]);
        }

        //java.net.InetAddress inetAddress = new InetAddress();
        InetSocketAddress socketAddress = new InetSocketAddress(1521);
        System.out.println(socketAddress.getAddress());
        System.out.println(socketAddress.getHostName()+":"+socketAddress.getPort());

        Enumeration<NetworkInterface> nt = NetworkInterface.getNetworkInterfaces();

        while (nt.hasMoreElements()){
            NetworkInterface networkInterface = nt.nextElement();
           // networkInterface.getInterfaceAddresses()
            //TODO why use NEtworkInterface
        }

      //  java.util.
    }
}

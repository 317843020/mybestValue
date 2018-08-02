package com.suhb.day03;

import java.io.*;
import java.util.Properties;

public class Propreties {

    //TODO 快速处理文件和CLASSPATH工具类，思考下apche和alibaba的实现

    public static void main(String[] args) {
        try {
            Propreties dubboAppStart = new Propreties();
            System.out.println(dubboAppStart.getClass());
            String fileurl = dubboAppStart.getClass().getResource("/resources/config.properties").getFile();
            System.out.println(fileurl);
            //= Class.forName(DubboAppStart.class.getName()).getResourceAsStream("/config.properties");
            InputStream fi = new FileInputStream(fileurl);
            Properties properties = new Properties();
            properties.load(fi);
            fi.close();
            FileOutputStream fo = new FileOutputStream(fileurl);
            //  OutputStream fo  = Class.forName(DubboAppStart.class.getName()).get("/config.properties");
            properties.setProperty("dubboport",args[0]);
            properties.store(fo,"haha");
            //properties.setProperty("dubboport",args[0]);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

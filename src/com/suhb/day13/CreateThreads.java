package com.suhb.day13;

import java.lang.management.*;
import java.util.List;

/**
 * @author ykw
 * @date :2018/8/21
 */
public class CreateThreads {
    /**
     * Thread class
     * @author Lukas Krecan
     *
     */
    private static final class MyThread extends Thread
    {
        private final int number;

        public MyThread(int number) {
            this.number = number;
        }
        @Override
        public void run() {
            if (shouldPrintMessage(number))
            {
                System.out.println("Thread no. "+number+" started.");
            }
            try {
                ThreadMXBean tm=(ThreadMXBean)ManagementFactory.getThreadMXBean();
                System.out.println("getThreadCount "+tm.getThreadCount());
                //sleep forever
                Thread.sleep(Long.MAX_VALUE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    /**
     * @param args
     */
    public static void main(String[] args) {
      //  testMyJVM();
        testHowThread();
    }

    private static boolean shouldPrintMessage(int i)
    {
        return i % 100 == 0;
    }

    public static void testMyJVM(){
        MemoryMXBean memorymbean = ManagementFactory.getMemoryMXBean();
        MemoryUsage usage = memorymbean.getHeapMemoryUsage();
        System.out.println("INIT HEAP: " + usage.getInit());
        System.out.println("MAX HEAP: " + usage.getMax());
        System.out.println("USE HEAP: " + usage.getUsed());
        System.out.println("\nFull Information:");
        System.out.println("Heap Memory Usage: "
                + memorymbean.getHeapMemoryUsage());
        System.out.println("Non-Heap Memory Usage: "
                + memorymbean.getNonHeapMemoryUsage());

        List<String> inputArguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        System.out.println("===================java options=============== ");
        System.out.println(inputArguments);



        System.out.println("=======================通过java来获取相关系统状态============================ ");
        int i = (int)Runtime.getRuntime().totalMemory()/1024;//Java 虚拟机中的内存总量,以字节为单位
        System.out.println("总的内存量 i is "+i);
        int j = (int)Runtime.getRuntime().freeMemory()/1024;//Java 虚拟机中的空闲内存量
        System.out.println("空闲内存量 j is "+j);
        System.out.println("最大内存量 is "+Runtime.getRuntime().maxMemory()/1024);

        System.out.println("=======================OperatingSystemMXBean============================ ");
        OperatingSystemMXBean osm = (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
//    System.out.println(osm.getFreeSwapSpaceSize()/1024);
//    System.out.println(osm.getFreePhysicalMemorySize()/1024);
//    System.out.println(osm.getTotalPhysicalMemorySize()/1024);

        //获取操作系统相关信息
        System.out.println("osm.getArch() "+osm.getArch());
        System.out.println("osm.getAvailableProcessors() "+osm.getAvailableProcessors());
        //System.out.println("osm.getCommittedVirtualMemorySize() "+osm.getCommittedVirtualMemorySize());
        System.out.println("osm.getName() "+osm.getName());
        //System.out.println("osm.getProcessCpuTime() "+osm.getProcessCpuTime());
        System.out.println("osm.getVersion() "+osm.getVersion());
        //获取整个虚拟机内存使用情况
        System.out.println("=======================MemoryMXBean============================ ");
        MemoryMXBean mm=(MemoryMXBean)ManagementFactory.getMemoryMXBean();
        System.out.println("getHeapMemoryUsage "+mm.getHeapMemoryUsage());
        System.out.println("getNonHeapMemoryUsage "+mm.getNonHeapMemoryUsage());
        //获取各个线程的各种状态，CPU 占用情况，以及整个系统中的线程状况
        System.out.println("=======================ThreadMXBean============================ ");
        ThreadMXBean tm=(ThreadMXBean)ManagementFactory.getThreadMXBean();
        System.out.println("getThreadCount "+tm.getThreadCount());
        System.out.println("getPeakThreadCount "+tm.getPeakThreadCount());
        System.out.println("getCurrentThreadCpuTime "+tm.getCurrentThreadCpuTime());
        System.out.println("getDaemonThreadCount "+tm.getDaemonThreadCount());
        System.out.println("getCurrentThreadUserTime "+tm.getCurrentThreadUserTime());

        //当前编译器情况
        System.out.println("=======================CompilationMXBean============================ ");
        CompilationMXBean gm=(CompilationMXBean)ManagementFactory.getCompilationMXBean();
        System.out.println("getName "+gm.getName());
        System.out.println("getTotalCompilationTime "+gm.getTotalCompilationTime());

        //获取多个内存池的使用情况
        System.out.println("=======================MemoryPoolMXBean============================ ");
        List<MemoryPoolMXBean> mpmList=ManagementFactory.getMemoryPoolMXBeans();
        for(MemoryPoolMXBean mpm:mpmList){
            System.out.println("getUsage "+mpm.getUsage());
            System.out.println("getMemoryManagerNames "+mpm.getMemoryManagerNames().toString());
        }
        //获取GC的次数以及花费时间之类的信息
        System.out.println("=======================MemoryPoolMXBean============================ ");
        List<GarbageCollectorMXBean> gcmList=ManagementFactory.getGarbageCollectorMXBeans();
        for(GarbageCollectorMXBean gcm:gcmList){
            System.out.println("getName "+gcm.getName());
            System.out.println("getMemoryPoolNames "+gcm.getMemoryPoolNames());
        }
        //获取运行时信息
        System.out.println("=======================RuntimeMXBean============================ ");
        RuntimeMXBean rmb=(RuntimeMXBean)ManagementFactory.getRuntimeMXBean();
        System.out.println("getClassPath "+rmb.getClassPath());
        System.out.println("getLibraryPath "+rmb.getLibraryPath());
        System.out.println("getVmVersion "+rmb.getVmVersion());


    }

    public static void testHowThread(){
        long startTime = System.currentTimeMillis();
        final int noOfThreads = 1000000;
        int i=0;
        try {
            for (i=0; i < noOfThreads; i++)
            {
                if (shouldPrintMessage(i))
                {
                    System.out.println("Creating thread "+i+" ("+(System.currentTimeMillis()-startTime)+"ms)");
                }
                new MyThread(i).start();
            }
        } catch (Throwable e) {
            System.out.println("Error thrown when creating thread "+i);
            e.printStackTrace();
        }
    }


}

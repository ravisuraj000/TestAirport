package com.airports.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedulerThreadPoolModel
{

    public static void main(String[] args) {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(100);
        List<String> strings = new ArrayList<>();
        for(int i=0;i<10;i++){
            strings.add("XXXX"+i);
        }
        for(int i=0;i < strings.size();i++){
            service.scheduleAtFixedRate(new Runnable() {
                @Override
                public void run() {
                    ThreadLocal<String> t = new ThreadLocal<>();
                    ThreadLocal<String> t1 = new ThreadLocal<>();

                    String uuid = UUID.randomUUID().toString();
                    t.set(uuid);
                    t1.set(Math.random()+"");
                    System.out.println(Thread.currentThread().getName() + " setting " + uuid);
                    System.out.println(Thread.currentThread() + " Getting " + t.get());
                    System.out.print(Thread.currentThread() + " " + t1.get());
                }
            }, 10, 50, TimeUnit.MICROSECONDS);
        }
        //service.shutdown();
    }
}

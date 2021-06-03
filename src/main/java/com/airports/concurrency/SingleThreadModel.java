package com.airports.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadModel {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        List<String> strings = new ArrayList<>();
        for(int i=0;i<1000;i++){
            strings.add("XXXX"+i);
        }
        for(int i=0;i < strings.size();i++){
            service.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        service.shutdown();
    }
}

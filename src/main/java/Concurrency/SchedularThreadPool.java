package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedularThreadPool {

    public static void main(String[] args) {

        ScheduledExecutorService service= Executors.newScheduledThreadPool(100);
        List<String> al=new ArrayList<>();

        for(int i=0;i<10;i++){
            al.add("xxxx"+i);

        }

        for (int i=0;i<al.size();i++){

        service.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
            ThreadLocal<String> t1=new ThreadLocal<>();
            ThreadLocal<String> t2=new ThreadLocal<>();
            String uuid= UUID.randomUUID().toString();
            t1.set(uuid);
            t2.set(Math.random()+"");
                System.out.println(Thread.currentThread().getName()+ " setting "+uuid);
                System.out.println(Thread.currentThread()+ " Getting "+ uuid);
                System.out.println(Thread.currentThread()+ " "+t1.get());
            }
        },2,2, TimeUnit.MILLISECONDS);
        }
       // service.shutdown();
    }

}

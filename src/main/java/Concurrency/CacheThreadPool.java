package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CacheThreadPool {

    public static void main(String[] args) {

        ExecutorService service=Executors.newCachedThreadPool();
        List<String> al=new ArrayList<>();
        for(int i=0;i<100;i++){
            al.add("xxxx"+ i);
        }

        for(int i=0;i<al.size();i++){
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

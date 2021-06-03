package Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadModel {

    public static void main(String[] args) {

        ExecutorService service= Executors.newSingleThreadExecutor();
        List<String> string=new ArrayList<>();

        for(int i=0;i<10;i++)
        {
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

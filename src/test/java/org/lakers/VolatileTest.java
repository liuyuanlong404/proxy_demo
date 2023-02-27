package org.lakers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created on 2023/2/25 15:32
 *
 * @author lakers
 */
public class VolatileTest {

    public volatile static int inc = 0;

    public synchronized void increase() {
        inc++;
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(5);
        VolatileTest volatileTest = new VolatileTest();
        for (int i = 0; i < 5; i++) {
            threadPool.execute(() -> {
                for (int j = 0; j < 500; j++) {
                    volatileTest.increase();
                }
            });
        }
        Thread.sleep(1500);
        System.out.println(inc);
        threadPool.shutdown();
    }
}

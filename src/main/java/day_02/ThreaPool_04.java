package day_02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池
 * 创建一个定长线程池，支持定时及周期性任务执行。延迟执行
 */
public class ThreaPool_04 {

    public static void main(String[] args) {

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        Runnable r1 = () -> System.out.println("当前线程" + Thread.currentThread().getName() + "3秒后执行");
        executorService.schedule(r1,3, TimeUnit.SECONDS);
        Runnable r2 = () -> System.out.println("当前线程" + Thread.currentThread().getName() + "延迟2秒,每5秒后执行");
        executorService.scheduleAtFixedRate(r2,2,5, TimeUnit.SECONDS);
        for (int i = 0; i < 5; i++) {
            executorService.execute(r1);
        }

    }

}

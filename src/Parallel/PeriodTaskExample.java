package Parallel;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class PeriodTaskExample {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);
        //5초 후에 실행하고 종료 후 10초 대기 후 반복 실행
        executorService.scheduleWithFixedDelay(new MyTask("Delayed 1"),5,10, TimeUnit.SECONDS);

        //5초 후에 실행하고, 10초 주기로 반복 실행
        executorService.scheduleAtFixedRate(new MyTask("Rate 1"),5,10, TimeUnit.SECONDS);

        //5초 후에 실행하고, 10초 주기로 반복 실행
        executorService.scheduleAtFixedRate(new MyTask("Rate 2"),5,10, TimeUnit.SECONDS);
    }
}

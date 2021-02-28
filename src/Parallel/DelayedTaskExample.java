package Parallel;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTaskExample {
    public static void main(String[] args) {
        //newScheduledThreadPool : 스레드가 특정 시간 이후, 혹은일정 시간 간격으로 실행되도록 하는 스레드풀을 생성
        //newSingleThreadScheduledExecutor : 하나의 스레드만 실행되며 나머지 스레드는 실행 시간이 지정되더라도 현재 실행중인 스레드가 종료될때까지 대기
        //unconfigurableScheduledExcecutor : ScheduledExecutorService를 구현한 여러 클래스의 기능 중 ExecutorService의 메서드만을 호출하고 나머지 기능을 제한할 필요가 있을때 사용
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();

        scheduledExecutorService.schedule(()-> System.out.println("Todo 1"),10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(()-> System.out.println("Todo 2"),20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(()-> System.out.println("Todo 3"),30, TimeUnit.SECONDS);
    }
}

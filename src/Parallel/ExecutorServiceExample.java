package Parallel;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

    public static void main(String[] args) {
        //newSingleTreadExecutor는 오직 하나의 스레드로 처리하며 나머지 스레드 요청은 현재 스레드가 종료될때까지 대기
        //ExecutorService executorService = Executors.newSingleThreadExecutor();

        //newFiexedThreadPool은 입력파라미터로 생성할 스레드 풀의 크기를 정의하며 스레드 풀의 크기내에서 스레드가 생성되어 병렬 처리됨
        //ExecutorService executorService = Executors.newFixedThreadPool(2);

        //newCachedThreadPool은 실행하는 스레드 수에 재한업싱 등록한 모든 스레드를 동시에 처리한다
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.execute(new MyTask("Todo 1"));
        executorService.execute(new MyTask("Todo 2"));
        executorService.execute(new MyTask("Todo 3"));
        executorService.shutdown();

    }
}

class MyTask implements Runnable {

    private String id;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task ID :" + id + ", running.." + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    MyTask(String id){
        this.id = id ;
    }
}

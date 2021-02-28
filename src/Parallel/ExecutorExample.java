package Parallel;

import java.util.concurrent.Executor;

public class ExecutorExample implements Executor {
    @Override
    public void execute(Runnable command) {
        command.run();

        //또는 new Thread(command).start();
    }

    public static void main(String[] args) {
        Executor excutor = new ExecutorExample();
        excutor.execute(() -> System.out.println("출력 완료"));
    }
}

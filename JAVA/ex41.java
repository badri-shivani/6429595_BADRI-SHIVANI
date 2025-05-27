import java.util.*;
import java.util.concurrent.*;

public class ex41 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Callable<String>> tasks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int taskNum = i + 1;
            tasks.add(() -> "Task " + taskNum + " executed by " + Thread.currentThread().getName());
        }

        try {
            List<Future<String>> results = executor.invokeAll(tasks);
            for (Future<String> result : results) {
                System.out.println(result.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        List<CallableTask> tasks= List.of(new CallableTask("in28Minutes"),new CallableTask("Adam"),
                new CallableTask("Bob"));

        String result=executorService.invokeAny(tasks);
        System.out.println(result);

        executorService.shutdown();
    }
}

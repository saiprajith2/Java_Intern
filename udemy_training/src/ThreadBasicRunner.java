class Task1 extends Thread{
    public void run(){
        System.out.print("\nTask1 Started");

        for(int i=101;i<=199;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask1 Done");
    }

}
class Task2 implements Runnable{

    @Override
    public void run() {
        System.out.print("\nTask2 Started");

        for(int i=201;i<=299;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask2 Done");
    }
}
public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {
        System.out.print("\nTask1 Kicked Off");
        Task1 task1=new Task1();
        task1.setPriority(1);
        task1.start();

        System.out.print("\nTask2 Kicked Off ");
        Task2 task2=new Task2();
        Thread task2Thread =new Thread(task2);
        task2Thread.setPriority(10);
        task2Thread.start();
        task1.join();//wait for task1 to complete
        task2Thread.join();//wait both for task 1 and task2 to complete before starting task3

        System.out.print("\nTask3 Kicked Off ");
        for(int i=301;i<=399;i++){
            System.out.print(i+" ");
        }
        System.out.print("\nTask3 Done");
        System.out.println("\nMain Done");

    }
}

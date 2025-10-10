package Multithreading.RunnableInterface;

public class Thread_2 implements Runnable{
    public Thread_2(){
        Thread thread=new Thread(this,"Thread_2");
        thread.start();
    }

    @Override
    public void run() {
        try{
            System.out.println("from 1 to 10");
            for (int i = 0; i <=10; i++) {
                System.out.println("child");
                Thread.sleep(5);
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

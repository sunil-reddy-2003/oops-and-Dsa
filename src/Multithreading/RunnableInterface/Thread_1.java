package Multithreading.RunnableInterface;

public class Thread_1 implements Runnable{

    public Thread_1(){
        Thread thread=new Thread(this,"Thread_1");
        thread.start();
    }

    @Override
    public void run() {
        try{
            System.out.println("from 10 to 1");
            for (int i = 10; i>=0; i--) {
                System.out.println("parent");
                Thread.sleep(5);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

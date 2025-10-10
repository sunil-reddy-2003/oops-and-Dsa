package Multithreading.ThreadClass;

public class SampleThread_1 extends Thread{
    public SampleThread_1(){
        start();
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

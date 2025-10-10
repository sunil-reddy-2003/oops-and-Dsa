package Multithreading.ThreadClass;

public class SampleThread_2 extends Thread{
    public SampleThread_2(){
        start();
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

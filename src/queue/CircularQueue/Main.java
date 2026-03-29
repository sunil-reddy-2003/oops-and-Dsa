package queue.CircularQueue;

public class Main {
    public static void main(String[] args) {
        CircularQueue queue=new CircularQueue(5);
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        int size= queue.Size();
        System.out.println("size: "+size);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.add(16);
        queue.add(169);

        System.out.println("front: "+queue.front());
        queue.display();

    }
}

package queue.QueueUsingStackRemoveEfficient;

public class Main {
    public static void main(String[] args) throws Exception {
        QueueUsingStack queue = new QueueUsingStack();

        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);

        System.out.println("Removed: " + queue.remove()); // 1
        System.out.println("Peek: " + queue.peek());      // 2

        System.out.println(queue);

        queue.add(6);
        System.out.println("After adding 6: " + queue);

    }
}

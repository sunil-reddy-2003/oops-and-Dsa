package queue.QueueUsingStackInsertionEfficient;

public class Main{
  public static void main(String[] args) throws Exception {
    QueueUsingStack queue=new QueueUsingStack();
    queue.add(1);
    queue.add(2);
    queue.add(3);
    queue.add(4);
    queue.add(5);
    System.out.println("removed: "+queue.remove());
//        System.out.println(queue.remove());
    System.out.println("peek element: "+queue.peek());
    System.out.println(queue);
}

}

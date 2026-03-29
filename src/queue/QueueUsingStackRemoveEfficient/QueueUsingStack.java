package queue.QueueUsingStackRemoveEfficient;
import java.util.Stack;

//Remove efficient
public class QueueUsingStack {
    private final Stack<Integer> first;
    private final Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item) throws Exception{
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        first.push(item);
        while (!second.isEmpty()){
            first.push(second.pop());
        }


    }
    public int remove() throws Exception{
        return first.pop();
    }
    public boolean isEmpty(){
        return first.isEmpty();
    }

    public int peek() throws Exception{

        return first.peek();
    }
    @Override
    public String toString() {
        return "Queue contents: " + first.toString();
    }

}

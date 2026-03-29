package stack.Stackk;
import java.util.Stack;
public class StackDefault {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.add(5);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
//        Stack<String> stack=new Stack<>();
//        stack.add("sun");
//        stack.add("il ");
//        stack.add("reddy");
//        System.out.println(stack);
//        System.out.println(stack.peek());
//        System.out.println(stack.size());

    }
}

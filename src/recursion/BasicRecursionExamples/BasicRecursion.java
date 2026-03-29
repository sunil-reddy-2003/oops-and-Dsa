package recursion.BasicRecursionExamples;

public class BasicRecursion {

    static void recursion(int n){
        if(n==0){
            return;
        }
//        System.out.println("before: "+n);
        recursion(n-1);
        System.out.println("after: "+n);
    }

    static void concept(int n){
        if(n==0) return;
        System.out.println(n);
        //pass the value and subtract next
//        concept(n--);
        //subtract first and then pass the value
        concept(--n);
    }

    public static void main(String[] args) {
         recursion(5);
        concept(5);
    }
}

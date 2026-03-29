package recursion.BasicRecursionExamples;


public class ExampleForRecursion
{
    static int numm(int num){
        if(num<=0){
            return 0;
        }
        return num+numm(num-1);
    }
    public static void main(String[] args) {
        System.out.println(numm(4));
    }
}
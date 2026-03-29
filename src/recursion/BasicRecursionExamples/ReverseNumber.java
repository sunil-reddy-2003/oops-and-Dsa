package recursion.BasicRecursionExamples;

public class ReverseNumber {
    static int revSum=0;
    static int revNumber(int n){
        if(n==0){
            return 0;
        }
        revSum=revSum*10+(n%10);
        return revNumber(n/10);
    }
    public static void main(String[] args) {
        revNumber(1824);
        System.out.println("reversed :"+revSum);

    }
}

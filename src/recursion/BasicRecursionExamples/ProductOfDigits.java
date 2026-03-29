package recursion.BasicRecursionExamples;

public class ProductOfDigits {
    static int productOfDigits(int n){
        if(n==0){
            return 1;
        }
        return productOfDigits(n/10)*(n%10);
    }
    public static void main(String[] args) {
        System.out.println("product of digits: "+ productOfDigits(123));
    }
}

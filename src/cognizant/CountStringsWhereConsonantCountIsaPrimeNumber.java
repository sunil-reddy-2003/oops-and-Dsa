package cognizant;

public class CountStringsWhereConsonantCountIsaPrimeNumber {
    public static void main(String[] args) {
//       String[] arr = {"apple", "sky", "bbb", "code"};
//        String[] arr={"aeiou", "a", "e"};
//        String[] arr={"chat", "dog", "ball"};
        String[] arr={"abc", "defg", "hij"};
       int total=0;
        for (int i = 0; i < arr.length; i++) {
            if(isPrime(consonantsCount(arr[i]))){
                total++;
            }
        }
        System.out.println("Count of Strings Where Consonant Count Is a Prime Number : "+total);

    }

    private static boolean isPrime(int num) {
        if(num<2){return false;}
        if(num>2 && num%2==0) return false;
        for (int i = 3; i <=Math.sqrt(num); i+=2) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    static int consonantsCount(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if("aeiouAEIOU".indexOf(s.charAt(i))==-1){count++;}
        }
        return count;
    }
}

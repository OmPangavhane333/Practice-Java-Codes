public class prime_func {
//    public static boolean isPrime(int n) {
//          if (n == 2){
//              return false;
//
//    }
//        for (int i=2; i<=n-i; i++){
//            if(n%i == 0){
//                return false;
//            }
//        }
//        return true;
//    }
    // Optimised code to find the no. is prime or not
    public static boolean isPrime(int n){
        if(n==2){
            return false;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%2 == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(2));
    }
}

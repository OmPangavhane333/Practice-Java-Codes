public class DecToBin {
    public static void Dectobin(int n){
        int num = n;
        int rem;
        int pow = 0;
        int bin = 0;

        while(n>0){
            rem = n % 2; // n = 8 rem = 0
            bin = bin + (rem * (int)Math.pow(10, pow)); // 0 + 0 * 10^0 so bin = 1

            pow++;
            n = n/2;
        }
        System.out.println("The Binary Number of " + num +" is:-  " + bin);
    }

    public static void main(String[] args) {
        Dectobin(15);
    }
}

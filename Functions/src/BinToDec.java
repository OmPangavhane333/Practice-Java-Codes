public class BinToDec {
    public static void Bintodec(int binNum){
        int num = binNum;
        int pow = 0;
        int dec = 0;

        while(binNum > 0){
            int LD = binNum%10;
            dec = dec + (LD * (int)Math.pow(2,pow));

            pow++;
            binNum = binNum/10;
        }
        System.out.println("Decimal of "+ num + " is:- "+ dec );
    }
    public static void main(String[] args) {
        Bintodec(1000);
    }

}

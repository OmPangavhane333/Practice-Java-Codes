public class cont {
    public static void main(String[] args) {
        System.out.println("**** Continue Statement ****\n");
        for(int i=0; i<= 100;i++){
            if(i%5==0 || i%10 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}

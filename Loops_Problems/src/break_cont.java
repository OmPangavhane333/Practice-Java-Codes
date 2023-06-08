
public class break_cont {
    public static void main(String[] args) {
        System.out.println("Break Statement");

        for (int i=1; i<= 5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am Out Of the Loop.");
    }
}

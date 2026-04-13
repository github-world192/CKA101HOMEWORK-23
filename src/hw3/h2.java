package hw3;
import java.util.Scanner;
public class h2 {
    public static void main(String[] args) {
        //產生亂數0~9
        Boolean guess = false;
        int input;
        int computerguess = (int) (Math.random() * 10) ; // 產生1到100的亂數
        System.out.println("產生的亂數是: " + computerguess);
        Scanner input2 = new Scanner(System.in);
        input = input2.nextInt();
        while(guess==false) {
        if(input!=computerguess){
            System.out.println("猜錯了");
        }else{
            System.out.println("猜對了");
            guess=true;
        }
    }
}
}
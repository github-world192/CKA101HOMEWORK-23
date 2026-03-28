package hw1;
//一打12個 200 顆蛋幾打幾顆
public class hw2 {
    public static void main(String[] args) {
        int egg = 200;
        int dozen = egg / 12;
        int leftEgg = egg % 12;
        System.out.println("蛋的打數為" + dozen);
        System.out.println("剩餘的蛋數為" + leftEgg);
    }
}
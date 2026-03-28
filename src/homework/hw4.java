package homework;
//pi = 3.1415 計算半徑為5的圓面積及周長
public class hw4 {
    public static void main(String[] args) {
        double pi = 3.1415;
        double radius = 5.0;

        double area = pi * radius * radius;
        double circumference = 2 * pi * radius;

        System.out.println("半徑為" + radius + "的圓面積為" + area);
        System.out.println("半徑為" + radius + "的圓周長為" + circumference);
    }
}

import java.util.Scanner;
public class Circlearea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle = ");
        float r = sc.nextFloat();
        float a = (22*r*r)/7;
        System.out.println("Area of circle = "+a);
    }
}

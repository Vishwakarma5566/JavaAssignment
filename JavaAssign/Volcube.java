import java.util.Scanner;
public class Volcube{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of cube ");
        int s = sc.nextInt();
        int a = s*s*s;
        System.out.println("Volume of cube = "+a);
    }
}
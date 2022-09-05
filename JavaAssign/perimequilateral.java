import java.util.Scanner;
public class perimequilateral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side of Equilateral triangle ");
        int a = sc.nextInt();
        int p = 3*a;
        System.out.println("Perimeter of Equilateral triangle = "+p);
    }
}

import java.util.Scanner;
public class perimparall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of adjacent sides ");
        System.out.print("s1 = ");
        int s1 = sc.nextInt();
        System.out.print("s2 = ");
        int s2 = sc.nextInt();
        int p = 2*(s1+s2);
        System.out.println("Perimeter of Parallelogram = "+p);
    }
}

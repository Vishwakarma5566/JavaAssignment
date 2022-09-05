import java.util.Scanner;
public class Simint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount ");
        int P = sc.nextInt();
        System.out.println("Rate of interest ");
        float R = sc.nextFloat();
        System.out.println("Enter time in years ");
        int T = sc.nextInt();
        double SI = P*R*T/100;
        System.out.println("Simple interest = "+SI);
    }
}

import java.util.Scanner;
public class Vol0cone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cone ");
        double r = sc.nextDouble();
        System.out.println("Enter height of cone ");
        double h = sc.nextDouble();
        double v = (22*r*r*h)/(3*7);
        System.out.println("Volume of cone = "+ v);
    }
}

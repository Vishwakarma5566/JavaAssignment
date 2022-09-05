import java.util.Scanner;
public class Csacylinder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of cylinder ");
        float r = sc.nextFloat();
        System.out.println("Enter height of cylinder ");
        float h = sc.nextFloat();
        double a = 2*3.14*r*h;
        System.out.println("CSA of cylinder = "+a);

    }
}
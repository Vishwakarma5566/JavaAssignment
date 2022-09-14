import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Salary and year of service =");
        float s = sc.nextFloat();
        int y = sc.nextInt();
        float n =s;
        if(y>5){
            double b = s/20;
            System.out.println("Net bonus amount = "+b);
        }
        else{
            System.out.println("Not eligible for bonus amount");
        }
    }
}

import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age = ");
        int age = sc.nextInt();
        System.out.print("Enter your sex M or F = ");
        char gen = sc.next().charAt(0);
        System.out.print("Enter your maritial status Y or N = ");
        char mar = sc.next().charAt(0);
        if(gen == 'F'){
            System.out.println("Place of service = Urban Areas Only");
        }
        if(gen=='M' & (age>=20 & age<40) ){
            System.out.println("Place of service = Can Work Anywhere ");
        }
        if(gen=='M' &(age>=40 & age<60)){
            System.out.println("Place of service = Urban Areas Only ");
        }
        if(age<20 | age>60){
            System.out.println("\"ERROR\"");
        }
    }
}

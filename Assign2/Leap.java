import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year = ");
        int y = sc.nextInt();
        if(y%4==0 & y%100!=0){
            System.out.println("Entered year is leap year");
        }
        else if(y%400==0){
            System.out.println("Entered year is leap year");
        }
        else{
            System.out.println("Entered year is NOT leap year");
        }
    }
}

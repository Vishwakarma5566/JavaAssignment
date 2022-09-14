import java.util.Scanner;
public class Attendence {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Number of classes held = "); 
       int n1 = sc.nextInt();
       System.out.print("Number of classes attended = ");
       int n2 = sc.nextInt();
       float p = (n2*100)/n1;
       System.out.println("Percentage of class attended = "+p);
       if(p<75){
        System.out.println("Not allowed");
       }
       else
        System.out.println("Allowed");
    }
}

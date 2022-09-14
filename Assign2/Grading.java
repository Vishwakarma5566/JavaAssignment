import java.util.Scanner;
public class Grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks = ");
        int m = sc.nextInt();
        if(m<25){
            System.out.println("Your Grade = "+"F");
        }
        if(m>=25 & m<45){
            System.out.println("Your Grade = "+"E");
        }
        if(m>=45 & m<50){
            System.out.println("Your Grade = "+"D");
        }
        if(m>=50 & m<60){
            System.out.println("Your Grade = "+"C");
        }
        if(m>=60 & m<80){
            System.out.println("Your Grade = "+"B");
        }
        if(m>=80){
            System.out.println("Your Grade = "+"A");
        }
    }
}

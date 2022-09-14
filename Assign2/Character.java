import java.net.SocketImpl;
import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character = ");
        char s = sc.next().charAt(0);
        if(s>=65 & s<=90){
            System.out.println("Upper case");
        }
        else if(s>=97 & s<=122){
            System.out.println("Lower case");
        }
    }
}

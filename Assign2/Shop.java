import java.util.Scanner;
public class Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of quantity ");
        int q = sc.nextInt();
        int c = q*100;
        int t=c;
        if(c>1000){
            int d = c-c/10;
            System.out.println("Total cost = "+d);
        }
        else{
            System.out.println("Total cost = "+t);
        }
    }
}

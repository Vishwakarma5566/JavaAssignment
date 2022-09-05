import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Where to stop ");
        int n = sc.nextInt();
        int n2;
        int sum=0;
        System.out.println("Enter the numbers");
        while(true){
            n2 = sc.nextInt();
            if(n2!=n){
                sum+=n2;
            }
            if(n2==n)
                break;
        }
        System.out.println("Entered numbers sum = "+sum);
    }
}

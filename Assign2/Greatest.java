import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+" Is Greatest");
        }
        else if(b>a){
            System.out.println(b+" Is Greatest");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}

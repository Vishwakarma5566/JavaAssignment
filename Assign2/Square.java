import java.util.Scanner;
public class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and bredth of rectangle ");
        int l = sc.nextInt();
        int b = sc.nextInt();
        if(l==b){
            System.out.println("Square");
        }
        else{
            System.out.println("Not Square");
        }

    }
}
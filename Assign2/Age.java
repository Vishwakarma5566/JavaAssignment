import java.util.Scanner;

import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of three people ");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        if(a1>a2 & a1>a3){
            System.out.println(a1+" is oldest ");
            if(a2>a3){
                System.out.println(a3+" is youngest ");
            }
            else{
                System.out.println(a2+" is  youngest");
            }
        }
        if(a2>a3 & a2>a1){
            System.out.println(a2+" is oldest ");
            System.out.println(a1+" is youngest");
        }
        else if(a3>a1 & a3>a2){
            System.out.println(a3+" is oldest");
            System.out.println(a1+" is youngest");
        }
    }
}

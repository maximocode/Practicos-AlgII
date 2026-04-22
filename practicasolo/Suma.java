import java.util.Scanner;

public class Suma {    
    
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("ingrese un numero");
        int a = sc.nextInt();
        System.out.println("ingreso " + a);
        System.out.println("ingrese otro");
        int b = sc.nextInt();
        System.out.println("ingreso " + b);
        System.out.println("suma " + (a+b));

    }
}
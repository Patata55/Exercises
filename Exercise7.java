import java.util.Scanner;

public class Exercise7
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter two numbers for a sum:");
        System.out.print("Number1: ");
        int numero1 = teclado.nextInt();
        System.out.print("Number2: ");
        int numero2 = teclado.nextInt();
        int suma = numero1 + numero2;
        System.out.println("Your sum is " + suma);
    }
}

import java.util.Scanner;

public class Exercise9
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter two numbers for a multiplication:");
        System.out.print("Number1: ");
        int numero1multiplicacion = teclado.nextInt();
        System.out.print("Number2: ");
        int numero2multiplicacion = teclado.nextInt();
        int multiplicacion = numero1multiplicacion * numero2multiplicacion;
        System.out.println("Your multipication is " + multiplicacion);
    }
}

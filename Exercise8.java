import java.util.Scanner;

public class Exercise8
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter two numbers for a subtraction:");
        System.out.print("Number1: ");
        int numero1resta = teclado.nextInt();
        System.out.print("Number2: ");
        int numero2resta = teclado.nextInt();
        int resta = numero1resta - numero2resta;
        System.out.println("Your substrction is " + resta);
    }
}

import java.util.Scanner;

public class Exercise10
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter two numbers for a division:");
        System.out.print("Number1: ");
        int numero1division = teclado.nextInt();
        System.out.print("Number2: ");
        int numero2division = teclado.nextInt();
        int division = numero1division/numero2division;
        System.out.println("Your division is " + division);
    }
}

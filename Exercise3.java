import java.util.Scanner;

public class Exercise3
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a decimal:");
        double decimal = teclado.nextDouble();
        System.out.println("Your decimal is " + decimal);
    }
}

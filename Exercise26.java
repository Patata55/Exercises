import java.util.Scanner;

public class Exercise26
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hello enter a number");
        int factory = teclado.nextInt();
        int multiply = 1;
        for( int i = 0; i < factory; i ++){
            multiply = multiply * (factory - i);
        }
        System.out.println("Factorial of the number " + multiply);
    }
}

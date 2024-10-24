import java.util.Scanner;

public class Exercise5
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a text:");
        String texto = teclado.next();
        System.out.println("Your text is " + texto);
    }
}

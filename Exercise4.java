import java.util.Scanner;

public class Exercise4
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter a character:");
        char personaje = teclado.next().charAt(0);
        System.out.println("Your character is " + personaje);
    }
}

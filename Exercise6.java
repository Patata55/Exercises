import java.util.Scanner;
public class Exercise6
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Enter true or false:");
        boolean real = teclado.nextBoolean();
        System.out.println("Your statemente is " + real);
    }
}

import java.util.Scanner;

public class Exercise27
{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Hello enter a string");
        String texto = teclado.next();
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
    }
}
}

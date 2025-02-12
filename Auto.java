import java.util.Scanner;
public class Auto
{
    private String marca;
    private String modelo;
    private int velocidad;
    public Auto(String marca1, String modelo1){
        marca = marca1;
        modelo = modelo1;
        velocidad = 0;
    }
    public Auto(String marca1, String modelo1, int velocidad1){
        marca = marca1;
        modelo = modelo1;
        velocidad = velocidad1;
    }
    public void mostrarInformacion(){
        System.out.println("Your car is a " + marca + ", model " + modelo + ", with a velocity of " + velocidad);
    }
    public void acelerar(){
        velocidad = velocidad + 10;
    }
    public void acelarar(int cantidad){
         velocidad = velocidad + cantidad;
    }
    public void frenar(){
        velocidad = velocidad - 10;
        while (velocidad < 0 ){
            velocidad++;
        }
    }
    public void frenar(int cantidad){
        velocidad = velocidad - cantidad;
        while (velocidad < 0 ){
            velocidad++;
        }
    }
    public static void main(String args[]){
        Scanner key = new Scanner(System.in);
        System.out.println("Hello what is your car?");
        System.out.print("Marc: ");
        String marca = key.nextLine();
        System.out.print("Model: ");
        String modelo = key.nextLine();
        System.out.print("Speed: ");
        int velocidad = key.nextInt();
        Auto vehiculol = new Auto(marca, modelo);
        vehiculol.mostrarInformacion();
        Auto vehiculo = new Auto(marca, modelo, velocidad);
        vehiculo.mostrarInformacion();
        vehiculo.acelerar();
        vehiculo.mostrarInformacion();
        System.out.println("How much do you want to acelerate?");
        int acelerar = key.nextInt();
        vehiculo.acelarar(acelerar);
        vehiculo.mostrarInformacion();
        vehiculo.frenar();
        vehiculo.mostrarInformacion();
        System.out.println("How much do you want to desacelerate?");
        int desacelerar = key.nextInt();
        vehiculo.frenar(desacelerar);
        vehiculo.mostrarInformacion();
    }
}

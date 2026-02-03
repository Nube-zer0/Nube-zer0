import java.util.Scanner;

public class Saludos {
    public static void main(String[] args) {
        System.out.println("Buenas dime tu nombre ");
        Scanner leer = new Scanner(System.in);
        String nombre = leer.next();
        System.out.println("Bienvenid@: "+nombre);
    }
}

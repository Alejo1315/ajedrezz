import java.util.Scanner;
import Logica.PiezaAjedrez;

public class Tipopieza {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Ingrese:"
                + "1) peon "
                + "2) torre"
                + "3) alfil "
                + "4) caballo"
                + "5) rey "
                + "6) dama");
        int tipop = entrada.nextInt();
        int x, y; 

        if (tipop == 1) {
            System.out.println("digite la ubicación del peon en x");
            x = entrada.nextInt();
            System.out.println("digite la ubicación del peon en Y");
            y = entrada.nextInt();
            if (x == 2) {
                System.out.println("el peon se puede mover dos posiciones hacia delante");
            } else if (x > 2 && x < 8) {
                System.out.println("el peon solo se puede mover una posición ");
            } else {
                System.out.println("el peon está en la última fila");
            }
        } else if (tipop == 2) {
            System.out.println("digite la ubicación de la torre x");
            x = entrada.nextInt();
            System.out.println("digite la ubicación de la torre en Y");
            y = entrada.nextInt();
            System.out.println("la torre tiene 14 movimientos");
        } else if (tipop == 3) {
            System.out.println("Digite la ubicación del alfil en X (1-8):");
            x = entrada.nextInt();
            System.out.println("Digite la ubicación del alfil en Y (1-8):");
            y = entrada.nextInt();
            PiezaAjedrez pieza = new PiezaAjedrez(x, y); 
            int movimientos = pieza.contarMovimientosAlfil(x, y);
            System.out.println("El alfil puede realizar " + movimientos + " movimientos.");
        } else {
            System.out.println("Opción no válida.");
        }else if (tipop == 4) {
            System.out.println("Digite la ubicación del caballo en X (1-8):");
            x = entrada.nextInt();
            System.out.println("Digite la ubicación del caballo en Y (1-8):");
            y = entrada.nextInt();
            PiezaAjedrez pieza = new PiezaAjedrez(x, y);
            int movimientos = pieza.contarMovimientosCaballo();
            System.out.println("El caballo puede realizar " + movimientos + " movimientos.");
        } else {
            System.out.println("Opción no válida.");
        }
        
    }    
    
}


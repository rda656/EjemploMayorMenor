package ejemplomayormenor;

import java.util.Scanner;

/**
 *
 * @author Antonio Ramos
 */
public class EjemploMayorMenor {

    /**
     * Método principal
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las dos variables donde vamos a guardar los dos números enteros
        int numero1, numero2;
        
        // Nos creamos un objeto de la clase Scanner que nos va a permitir leer desde el teclado
        Scanner teclado = new Scanner(System.in);
        
        // Mostramos un mensaje por pantalla para que el usuario sepa que debe introducir un dato
        System.out.print("Introduzca el primer número: ");
        // Realizamos la lectura desde teclado de un número entero mediante el método nextInt
        // y lo guardamos en la primera variable, numero1
        numero1 = teclado.nextInt();
        
        // Repetimos la operación pero esta vez con la segunda variable.
        System.out.print("Introduzca el segundo número: ");
        numero2 = teclado.nextInt();
        
        // Comprobamos que número es mayor, si el de la variable 1 o el de la variable 2
        // y mostramos por pantalla un mensaje con el número mayor.
        if(numero1 > numero2){
            System.out.println("El primer número, " +  numero1 + " es el mayor de los dos");
        }
        else{
            System.out.println("El segundo número, " +  numero2 + " es el mayor de los dos");
        }
        
    }
    
}

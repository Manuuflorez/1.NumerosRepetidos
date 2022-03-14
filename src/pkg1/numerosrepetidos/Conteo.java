package pkg1.numerosrepetidos;

import java.util.Scanner;

/*Crear un algoritmo que lea un vector de tamaño N de números enteros y 
un dato y devuelva la cantidad de veces que está dicho dato en el vector
 */
public class Conteo {

    int[] Datos;

    public Conteo(int[] Datos) {
        this.Datos = Datos;
    }

    public void LlenarDatos() {
        System.out.println("Ingresa los numeros");
        for (int i = 0; i < Datos.length; i++) {
            Datos[i] = new Scanner(System.in).nextInt();
        }
    }

    public void repetidos() {
        for (int i = 0; i < Datos.length; i++) {
            int contador = 0;
            for (int j = 0; j < Datos.length; j++) {
                if (Datos[i] == Datos[j]) {
                    contador++;
                }
            }
            System.out.println("Cantidad de veces que se repite el numero " + Datos[i] + " es: " + contador);
        }
    }
}

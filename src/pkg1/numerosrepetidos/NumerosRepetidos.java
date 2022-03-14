package pkg1.numerosrepetidos;

/*Crear un algoritmo que lea un vector de tamaño N de números enteros y 
un dato y devuelva la cantidad de veces que está dicho dato en el vector
 */
import java.util.Scanner;

public class NumerosRepetidos {

    public static void main(String[] args) {
        System.out.println("Cuantos numeros tendra el vector?");
        int TamanoVector = new Scanner(System.in).nextInt();
        int[] Datos = new int[TamanoVector];
        Conteo objConteo=new Conteo(Datos);
        objConteo.LlenarDatos();
        objConteo.repetidos();
    }

}

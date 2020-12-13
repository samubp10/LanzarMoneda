/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.LanzarMonedaMejorado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Samuel
 */
public class LanzarMonedaMejorado {
    
    public static int pedir(){
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese el número de caracteres que va a contener los arrays");
        numero = teclado.nextInt();
        return numero;
    }

    private boolean[] lanzar = new boolean[pedir()];

    public LanzarMonedaMejorado() {
    }

    private static boolean lanzarMejorado() {
        // Necesitaremos un Random para que nos de valores booelan aleatorios
        Random random = new Random();

        // Crearemos un boolean alea para la recogida de datos del aleatorio
        boolean alea = random.nextBoolean();

        // Y devolveremos el resultado
        return alea;
    }

    public void llenarArrayMejorado() {
        for (int i = 0; i < lanzar.length; i++) {
            lanzar[i] = LanzarMonedaMejorado.lanzarMejorado();
        }
    }

    public int carasMejorado() {
        int contadorCara = 0;
        for (int i = 0; i < lanzar.length; i++) {
            if (lanzar[i] == true) {
                contadorCara++;
            }
        }
        return contadorCara;
    }

    public int crucesMejorado() {
        int contadorCruces = 0;
        for (int i = 0; i < lanzar.length; i++) {
            if (lanzar[i] == false) {
                contadorCruces++;
            }
        }
        return contadorCruces;
    }

    public void imprimirMejorado() {

        // Crearemos un array de tipo String para luego almacenar e imprimir los
        // valores
        String[] resultados = new String[lanzar.length];

        // En este for pasaremos los true y false del array de booleans a 
        // formato entendible a travÃ©s de un array de texto
        for (int i = 0; i < lanzar.length; i++) {
            if (lanzar[i] == true) { // true
                resultados[i] = "Cara";
            } else { // false
                resultados[i] = "Cruz";
            }
        }
        for (int i = 0; i < resultados.length; i++) {
            System.out.println("El resultado de la tirada numero " + (i + 1)
                    + " es: " + resultados[i]);

        }
    }
}

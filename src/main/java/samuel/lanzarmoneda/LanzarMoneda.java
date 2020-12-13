/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.lanzarmoneda;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Samuel
 */
public class LanzarMoneda {

    private boolean[] lanzar = new boolean[1000];

    public LanzarMoneda() {
    }

    private static boolean lanzar() {
        // Necesitaremos un Random para que nos de valores booelan aleatorios
        Random random = new Random();

        // Crearemos un boolean alea para la recogida de datos del aleatorio
        boolean alea = random.nextBoolean();

        // Y devolveremos el resultado
        return alea;
    }

    public void llenarArray() {
        for(int i=0;i<lanzar.length;i++){
            lanzar[i]=LanzarMoneda.lanzar();
        }
    }

    public int caras() {
        int contadorCara = 0;
        for (int i = 0; i < lanzar.length; i++) {
            if(lanzar[i] == true) {
                contadorCara++;
            }
        }
        return contadorCara;
    }


    public int cruces() {
        int contadorCruces = 0;
        for (int i = 0; i < lanzar.length; i++) {
            if(lanzar[i] == false) {
                contadorCruces++;
            }
        }
        return contadorCruces;
    }

    public void imprimir() {

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

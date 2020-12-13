/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.LanzarMonedaMejorado;

/**
 *
 * @author Samuel
 */
public class LanzarMonedaMejoradoPrueba {

    public static void main(String[] args) {
        LanzarMonedaMejorado LanzarMoneda1 = new LanzarMonedaMejorado();
        LanzarMoneda1.llenarArrayMejorado();
        LanzarMoneda1.imprimirMejorado();
        System.out.println("El número de caras ha sido " + LanzarMoneda1.carasMejorado());
        System.out.println("El número de cruces ha sido " + LanzarMoneda1.crucesMejorado());
        // Mostrará el número de caras y cruces que ha mostrado por pantalla
    }
}

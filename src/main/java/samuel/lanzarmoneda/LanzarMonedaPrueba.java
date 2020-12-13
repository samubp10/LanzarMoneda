/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samuel.lanzarmoneda;

/**
 *
 * @author Samuel
 */
public class LanzarMonedaPrueba {

    public static void main(String[] args) {
        LanzarMoneda LanzarMoneda1 = new LanzarMoneda();
        System.out.println("El número de caras ha sido " + LanzarMoneda1.caras());
        System.out.println("El número de cruces ha sido " + LanzarMoneda1.cruces());
        LanzarMoneda1.llenarArray();
        LanzarMoneda1.imprimir();
        System.out.println("El número de caras ha sido " + LanzarMoneda1.caras());
        System.out.println("El número de cruces ha sido " + LanzarMoneda1.cruces());
        // Mostrará el número de caras y cruces que ha mostrado por pantalla
    }
}

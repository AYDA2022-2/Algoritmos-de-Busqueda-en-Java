/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.busqueda;

import java.util.Arrays;

/**
 *
 * @author adriana ovallos
 */
public class Busqueda {


    public static Integer Secuencial(Integer[] data, int valor) {
        Integer pos = null;
        for (int i = 0; i < data.length; i++) {
            if (valor == data[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
    
    public static void main(String[] args) {
        Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición de forma secuencial		
        Integer index = Busqueda.Secuencial(datos, 11); // Busca 11
        System.out.println("Buscando 11 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
		
        index = Busqueda.Secuencial(datos, 12); // Busca 12
        System.out.println("Buscando 12 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}
    
    
    
    
    







}
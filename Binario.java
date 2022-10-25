/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busqueda;

import java.util.Arrays;

/**
 *
 * @author adriana ovallos
 */
public class Binario {

  public static Integer Binario(Integer[] data, Integer valor) {
        int li = 0;
        int ls = data.length;
        while (li <= ls) {
            int lm = (ls - li) / 2 + li;
            if (data[lm] < valor) {
                li = lm + 1;
            } else if (data[lm] > valor) {
                ls = lm - 1;
            } else {
                return lm;
            }
        }
        return null;
    }
  
   public static void main(String[] args) {
        Integer[] datos = {2, 255, 10, 0, 11, 1172, 1};
        System.out.println("Array: " + Arrays.toString(datos));
        
        //Búsqueda de la posición por búsqueda binaria
        Arrays.sort(datos); // Ordenamiento de datos
        System.out.println("Array ordenado: " + Arrays.toString(datos));
        
        Integer index = Binario.Binario(datos, 172); 
        System.out.println("Buscando 172 ..."); 
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
        
        index = Binario.Binario(datos, 255);
        System.out.println("Buscando 255 ...");
        //Mostrar resultado
        if (index != null) {
            System.out.println("Elemento encontrado en la posición " + index);
        } else {
            System.out.println("Elemento no encontrado");
        }
    }
}

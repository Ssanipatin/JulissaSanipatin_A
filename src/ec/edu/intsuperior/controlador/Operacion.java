/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.controlador;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Operacion {
    static Scanner leer= new Scanner(System.in);
    
    public static int edad(int anio){
        int n,ed;
        System.out.println("Ingresa tu año de nacimiento");
        n=leer.nextInt();
        ed=anio-n;
        return ed;
    }
    
}

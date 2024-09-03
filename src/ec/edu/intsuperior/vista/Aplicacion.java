/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author l1
 */
public class Aplicacion {

    static Scanner leer = new Scanner(System.in);

    public static void ejercicio_11() {
        int num;
        boolean multiplo_3;
        multiplo_3 = false;
        for (int i = 0; i < 5; i++)
        System.out.println("introduzca un numero");
        num=leer.nextInt();

        if (num % 3 == 0) {
            multiplo_3 = true;
        }

        if (multiplo_3 == false) {
            System.out.println(
                    "no existen multiplos de 3");
        } else {
            System.out.println(
                    "hay multiplos de 3");
        }

    }

    public static void ejercicio_12() {
        int num;
        boolean hay_negativo;
        hay_negativo = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("introduzca un numero");
        }
        num = leer.nextInt();
        if (num < 0) {
            hay_negativo = true;
        }

        if (hay_negativo == true) {
            System.out.println("se a introducidoalgun numero negativo");
        } else {
            System.out.println("no hay ningun numero negativo");
        }

    }

    public static void ejercicio_13() {
        int sueldo, sueldo_max, n;
        sueldo_max = 0;
        System.out.println("numero de sueldos");
        n = leer.nextInt();
        System.out.println("------");
        for (int i = 1; i < n; i++) {
            System.out.println("introduce sueldo: ");
        }
        sueldo = leer.nextInt();
        if (sueldo > sueldo_max) {
            sueldo_max = sueldo;
        }

        System.out.println("el sueldo maximo es: " + sueldo_max);

    }

    public static void ejercicio_14() {
        int codigo, litros, litros_cod1, mas_600;
        float precio;
        float importe_factura;
        float facturacion_total;
        facturacion_total = 0;
        litros_cod1 = 0;
        mas_600 = 0;
        for (int i = 1; i < 5; i++) {
            System.out.println("factura n" + i);
        }
        System.out.println("codigo del producto;");
        codigo = leer.nextInt();
        System.out.println("cantidad(litros):");
        litros = leer.nextInt();
        System.out.println("precio(litro):");
        precio = leer.nextFloat();
        importe_factura = litros * precio;
        facturacion_total += importe_factura;
        if (codigo == 1) {
            litros_cod1 += litros;
        }
        if (importe_factura >= 600) {
            mas_600++;
        }

        System.out.println("n/n/n resumen de ventas/n");
        System.out.println("la facturacion total es de :" + facturacion_total + "E");

    }

    public static void ejercicio_15() {
        int num;
        do {
            System.out.println("introdce un numero (de 0 al 10): ");
            num = leer.nextInt();

        } while (!(0 <= num && num <= 10));
        System.out.println("tabla del:" + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "x" + i + "=" + num * i);
        }

    }
    

}

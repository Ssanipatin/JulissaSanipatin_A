/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.intsuperior.modelo;

import java.util.Scanner;

/**
 *
 * @author l1
 */
public class Aplicacion {

    static Scanner leer = new Scanner(System.in);

    public static int sumapares(int numpares) {
        int num, suma, i;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        suma = 0;
        i = 20;
        while (i <= num) {
            suma = suma + i;
            i = i++;
        }

        return suma;
    }

    public static int multiplicacion(int multi) {
        int num, num1, mult;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        System.out.println("ingreseun segundo numero");
        num1 = leer.nextInt();
        num * num1 == mult;
        return mult;

    }

    public static int maximo(int maximo) {
        int n1, n2;
        System.out.println("escriba un numero");
        n1 = leer.nextInt();
        System.out.println("escriba un segundo numero");
        n2 = leer.nextInt();
        return n1 > n2 ? n1 : n2;

    }

    public static int factorial(int fac) {
        int num, fact;
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        if (num == 0) {
            return 1;
        }
        for (int i = 1; i <= num; i++) {
            fact = i;
            return fact;
        }
    }

    public static int contardigitos(int cont) {
        int num;
        System.out.println("ingrese un numero que desee contar los digitos");
        num = leer.nextInt();
        return String.valueOf(Math.abs(num)).length();

    }

    public static int decimalabinario(int bin) {
        int numd;
        System.out.println("ingrese un numero decimal");
        numd = leer.nextInt();
        return Integer.parseInt(Integer.toBinaryString(numd));

    }

    public static int espositivo(int posi) {
        int num;
        System.out.println("ingrese un numero que desee saber si es positivo");
        num = leer.nextInt();
        return num > 0 ? 1 : 0;

    }

    public static int sumadigitos(int sumd) {
        int num, suma;
        System.out.println("ingrese un numero que desee sumar sus digitos");
        num = leer.nextInt();
        num = Math.abs(num);
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        suma = leer.nextInt();

        return suma;

    }

    public static int cociente(int coc) {
        int num1, num2;
        System.out.println("ingrese un numero");
        num1 = leer.nextInt();
        System.out.println("ingrese un segundo numero");
        num2 = leer.nextInt();
        if (num2 == 0) {
            System.out.println("no se puede dividir por cero");
        }

        return num1 / num2;

    }
    
    public static int esmultiplo (int multiplo) {
        int n1,n2;
        System.out.println("ingrese un numero");
        n1=leer.nextInt();
        System.out.println("ingrese un numero que desee sabersi es multiplo del anterior");
        n2=leer.nextInt();
        return n2!=0 && n1/n2==0?1:0;
    }
}

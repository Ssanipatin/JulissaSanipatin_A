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
public class Aplicacion1 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void ejercicio_1() {
        int a, b, c;
        System.out.println("ingrese primer numero");
        a = leer.nextInt();
        System.out.println("ingresa un segundo numero");
        b = leer.nextInt();
        System.out.println("ingrese un tercer numero");
        c = leer.nextInt();

        if (a > b && b > c) {
            System.out.println(a + ", " + b + ", " + c);
        } else {
            if (a > c && c > b) {
                System.out.println(a + ", " + c + ", " + b);
            } else {
                System.out.println("terminar ejercicio");

            }
        }
    }

    public static void ejercicio_2() {
        int num;
        System.out.println("introduzca un numero enteo entre 0 y 9.999:");
        num = leer.nextInt();

        if (num < 10) {
            System.out.println("tiene una cifra");
        } else {
            if (num < 100) {
                System.out.println("tiene dos cifras");
            } else {
                if (num < 1000) {
                    System.out.println("tiene tres cofras");
                } else {
                    if (num < 10000) {
                        System.out.println("tienecuatro cifras");
                    }

                }
            }
        }
    }

    public static void ejercicio_3() {
        int num;
        int dm, um, c, d, u;
        System.out.println("intoduzca un numero entre 0 y 9.999");
        num = leer.nextInt();
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num;
        num = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(num);

    }

    public static void ejercicio_4() {
        int num;
        int dm, um, c, d, u;
        boolean capicua = false;
        System.out.println("introduzca un numero entre 0 y 9.999");
        num = leer.nextInt();
        u = num % 10;
        num = num / 10;
        d = num % 10;
        num = num / 10;
        c = num % 10;
        num = num / 10;
        um = num % 10;
        num = num / 10;
        dm = num % 10;
        num = num / 10;
        if (dm == u && d == c) {
            System.out.println("el numero es capicua");
        } else {
            System.out.println("el numero no es capicua ");
        }

    }

    public static void ejercicio_5() {
        int nota;
        System.out.println("intoduzca una nota");
        nota = leer.nextInt();
        if (nota >= 0 && nota < 5) {
            System.out.println("insuficiente");
        } else if (nota == 5) {
            System.out.println("suficiente");
        } else if (nota == 6) {
            System.out.println("bien");
        } else if (nota == 7) {
            System.out.println("bueno");
        } else if (nota == 8) {
            System.out.println("notable");
        } else if (nota == 9) {
            System.out.println("saliente");

        } else if (nota == 10) {
            System.out.println("sobresaliente");
        }
    }

    public static void ejercicio_6() {
        int num;
        System.out.println("introduzca un numero");
        num = leer.nextInt();
          while (num != 0) {
            if (num > 0) {
                System.out.println("positivo");
            } else {
                System.out.println("negativo");
            }
        }
        System.out.println("introduzca un numero");
        num = leer.nextInt();
    

    

    

  
}
    
    public static void ejercicio_7() {
        int num, cuadrado;
        do {
            System.out.println("intoduce un numero(negativo para salir) ");
        num = leer.nextInt();
        if (num >= 0) {
        cuadrado = num * num;
        System.out.println("el cuadradode " + num + "es" + cuadrado);
        cuadrado = num * num;
        System.out.println("el cuadradode " + num + "es" + cuadrado);
        }else 
          System.out.println("intoduce un numero negativo para el fin del programa");
        }while (num >= 0);
        leer.close();
    }

    public static void ejercicio_8() {
        int n;
        int suma = 0;
        System.out.println("intoduce numeros para sumar. teclea 0 para terminar");
        do {
            System.out.println("intoduce un numero");
          n = leer.nextInt();
        suma += n;
        }while (n != 0);
            System.out.println("la suma de los numeros es" + suma);
        }
    }

    public static void ejercicio_9() {
        int n, num;
        System.out.println("introduce N:");
        n = leer.nextInt();
        System.out.println("intoduce un numero");
        num = leer.nextInt();
        while (num != n) {
            if (num > n) {
                System.out.println("menor");
            } else {
                System.out.println("mayor");
            }
        }
        System.out.println("intorduce un numero");
        num = leer.nextInt();
        System.out.println("acertaste...");

    }

    public static void ejercicio_10() {
        int num, cont;
        System.out.println("introduzca un numero");
        num = leer.nextInt();
        cont = 0
        :
        while (num > 0) {
            cont = cont + 1;
        }
        System.out.println("introduzca otro numero");
        num = leer.nextInt();
        System.out.println("se ha introducido;" + cont + "numeros");

    }
}

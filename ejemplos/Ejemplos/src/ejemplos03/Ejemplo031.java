/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Generar una soluicion q permita sumar 2 numeros, los numeros deben ser ingresados en el metodo main, el metodo que
//genera la suma debe verificar que los numeros sean positivos para realizar la operacion caso contrario debe devolver 
//0 
package ejemplos03;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int valor1;
        int valor2;

        System.out.println("Ingrese el valor para el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Ingrese el valor para el segundo valor");
        valor2 = entrada.nextInt();

        int valor = obtenerSuma(valor1, valor2); // se invoca al método 
        // obtenerSuma
        System.out.printf("El valor de la suma es: %d\n", valor);

        // System.out.printf("El valor de la suma es: %d\n", obtenerSuma(10, 30));
    }

    public static int obtenerSuma(int a, int b) {
        int suma;

        if (a > 0 && b > 0) {
            suma = a + b;
        }else{
            suma = 0;
        }
        return suma;
        // return a + b;
    }

}

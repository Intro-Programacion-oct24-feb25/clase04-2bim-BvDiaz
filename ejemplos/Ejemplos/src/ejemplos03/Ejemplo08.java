/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite;
        int tabla;
        int signo;
        String mensajeSuma;

        System.out.println("Ingrese limite de la tabla");
        limite = entrada.nextInt();
        System.out.println("Ingrese la tabla a realizar");
        tabla = entrada.nextInt();
        System.out.println("Ingrese apoeracion a realizar suma(1) o"
                + "multiplicacion (2)");
        signo = entrada.nextInt();

        switch (signo) {
            case 1:
                mensajeSuma = obtenerTablaSumar(limite, tabla);
            case 2:
                mensajeSuma = obtenerTablaMultiplicar(limite, tabla);

                System.out.printf("%s\n", mensajeSuma);
        }

    }

    public static String obtenerTablaSumar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;
    }

    public static String obtenerTablaMultiplicar(int limite, int tabla) {
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i,
                    operacion);
        }
        return cadena;

    }

}

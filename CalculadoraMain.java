package com.mycompany.calculadoraconversion;

import java.util.Scanner;

public class CalculadoraMain {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        int seleccion = 0;
        int sw = 0;

        while (opcion != 2) {
            if (sw == 0) {
                System.out.println("-------------------------------------------");
                System.out.println("Bienvenido al Convertidor de Bases Decimales!");
                sw = 1;
            }

            System.out.println("Desea realizar alguna operacion?  1.Si  2.No");
            System.out.println("-------------------------------------------");
            opcion = in.nextInt();
            if (opcion == 1) {
                while (seleccion < 1 || seleccion > 3) {
                    System.out.println("1.Decimal a Binario\n2.Decimal a Hexadecimal\n3.Decimal a Octal");
                    seleccion = in.nextInt();
                }
                if (seleccion == 1) {
                    DecimalBinario binario = new DecimalBinario();
                    binario.Conversion();
                    seleccion=0;
                } else if (seleccion == 2) {
                    DecimalHexadecimal hexa = new DecimalHexadecimal();
                    hexa.Conversion();
                    seleccion=0;
                } else {
                    DecimalOctal octal = new DecimalOctal();
                    octal.Conversion();
                    seleccion=0;

                }

            } else if (opcion == 2) {
                System.out.println("Bay Bay");
                break;
            } else {
                opcion = 0;
            }

        }

    }

}

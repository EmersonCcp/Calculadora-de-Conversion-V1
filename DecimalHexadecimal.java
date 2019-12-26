package com.mycompany.calculadoraconversion;

import java.util.Scanner;

public class DecimalHexadecimal {

    private int num;
    private int copia;
    private int dim = 0;
    private int c_dim;
    private int i = 0;
    private int aux;
    private String receptor;
    private int acu;

    private Scanner in = new Scanner(System.in);

    public void Conversion() {
        System.out.println("Ingrese el numero a convertir: ");
        num = in.nextInt();
        copia = num;

        while ((copia / 16) != 0) {
            copia = copia / 16;
            dim++;
        }

        c_dim = dim;
        String Vec[] = new String[c_dim + 1];

        copia = num;
        i = dim ;
        while (i >= 0) {

            aux = copia / 16;
            aux = aux * 16;
            if ((copia - aux) == 10) {

                Vec[i] = "A";

            } else if ((copia - aux) == 11) {

                Vec[i] = "B";
            } else if ((copia - aux) == 12) {

                Vec[i] = "C";
            } else if ((copia - aux) == 13) {

                Vec[i] = "D";
            } else if ((copia - aux) == 14) {

                Vec[i] = "E";
            } else if ((copia - aux) == 15) {

                Vec[i] = "F";
            } else {

                acu = copia - aux;
                receptor = Integer.toString(acu);
                
                Vec[i] = receptor;

            }
            i--;
            copia = copia / 16;
        }

        System.out.println("El numero "+num+" a Hexadecimal es: ");
        for (i = 0; i <= c_dim; i++) {
            System.out.print("" + Vec[i]);
        }
        System.out.println("");
    }
}

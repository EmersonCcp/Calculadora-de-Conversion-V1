package com.mycompany.calculadoraconversion;

import java.util.Scanner;

public class DecimalBinario {

    private Scanner in = new Scanner(System.in);
    private int num = 0;
    private int i = 0;
    private int copia;
    private int dim = 0;
    private int aux = 0;
    private int c_dim = 0;
    private int opcion = 0;

    public void Conversion() {
        System.out.println("Ingrese el numero a convertir a Binario: ");
        num = in.nextInt();
        copia = num;

        while (copia > 1) {

            copia = copia / 2;
            dim++;
        }

        //System.out.println(dim);
        c_dim = dim + 1;
        int Vec[] = new int[c_dim];

        copia = num;
        i = dim;
        while (i >= 0) {
            aux = copia / 2;

            aux = aux * 2;
            if ((copia - aux) == 1) {
                Vec[i] = 1;
            } else if ((copia - aux) == 0) {
                Vec[i] = 0;
            }
            i--;

            copia = copia / 2;
        }
        System.out.println("\n");

        System.out.println("El numero " + num + " en binario es: ");
        for (i = 0; i <= dim; i++) {
            System.out.print(" " + Vec[i]);

        }
        System.out.println("\n");
    }
}

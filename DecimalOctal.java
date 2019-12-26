package com.mycompany.calculadoraconversion;

import java.util.Scanner;


public class DecimalOctal {

    private int num;
    private int copia;
    private int dim = 0;
    private int c_dim;
    private int i = 0;
    private int aux;

    private Scanner in = new Scanner(System.in);

    public void Conversion() {
        System.out.println("Ingrese el numero a convertir: ");
        num = in.nextInt();
        copia = num;

        while ((copia / 8) != 0) {
            copia = copia / 8;
            dim++;
        }

        System.out.println(dim);

        c_dim = dim;
        int Vec[] = new int[c_dim + 1];

        copia = num;
        i = dim ;

        while (i >= 0) {

            aux = copia / 8;
            aux = aux * 8;

            Vec[i] = (copia - aux);
            i--;
            copia = copia / 8;
        }
        System.out.println("El numero " + num + " en octal es: ");
       
        for (i = 0; i <= c_dim; i++) {
            System.out.print("" + Vec[i]);
        }
        System.out.println("");
    }

    

}

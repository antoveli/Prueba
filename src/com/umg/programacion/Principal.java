package com.umg.programacion;

import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Principal {

    public static void main(String[] args) {


        Tv miTV = new Tv();
        miTV.setEsPlano(true);
        miTV.setMarca("Sony");
        miTV.setPulgadas(17);
        miTV.addCanal( new Canal(1, "Dibujos Animados", true ) );


        System.out.println("Ingrese el No. Canal");
        Scanner sn = new Scanner(System.in);
        int canal= sn.nextInt();

        if(miTV.permitidoMenores(canal))
        {
            System.out.println("Permite Menores");
        }
        else {
            System.out.println(" No Permite Menores");
        }


        System.out.println("Ingrese el No. Canal 2");
        Scanner sn2 = new Scanner(System.in);
        int canal2= sn.nextInt();

        Tv miTV2 = new Tv();
        miTV2.setEsPlano(true);
        miTV2.setMarca("Samsumg");
        miTV2.setPulgadas(17);
        miTV2.addCanal( new Canal(2, "Ficcion", false ) );

        if(miTV2.permitidoMenores(canal2))
        {
            System.out.println("Permite Menores");
        }
        else {
            System.out.println("No Permite Menores");
        }



    }

}

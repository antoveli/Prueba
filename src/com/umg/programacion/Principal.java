package com.umg.programacion;

import java.util.Scanner;

/**
 * Created by alumno on 5/07/2017.
 */
public class Principal {

    public static void main(String[] args) {
       // Scanner sn = new Scanner();
        Tv miTV = new Tv();
        miTV.setEsPlano(true);
        miTV.setMarca("Sony");
        miTV.setPulgadas(17);
        miTV.addCanal( new Canal(1, "Dibujos Animados", true ) );

        if(miTV.permitidoMenores(1))
        {
            System.out.println("Permite Menores");
        }
        else {
            System.out.println(" No Permite Menores");
        }

        Tv miTV2 = new Tv();
        miTV2.setEsPlano(true);
        miTV2.setMarca("Samsumg");
        miTV2.setPulgadas(17);
        miTV2.addCanal( new Canal(2, "Ficcion", false ) );

        if(miTV2.permitidoMenores(2))
        {
            System.out.println("Permite Menores");
        }
        else {
            System.out.println("No Permite Menores");
        }



    }

}

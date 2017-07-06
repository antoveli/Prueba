package com.umg.programacion;

/**
 * Created by alumno on 5/07/2017.
 */
public class Principal {

public static void main(String[] args)
{
    Canal miCanal = new Canal();
    miCanal.listadoCanales();



    if(miCanal.devolverCanal("2"))
   {
       System.out.println("Es permitido para Menores");
   }
}

}

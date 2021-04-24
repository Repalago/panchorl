package panchorl;

import java.util.ArrayList;
import java.util.List;

public class Panchorl {

    public static void main(String[] args) {
        // int test1 = sumeti(5,42);
        // System.out.println(test1);
        // int test2 = multipli(4,5);
        // System.out.println(test2);
        //int test3 = potensia (2,8);
        //System.out.println(test3);
        /* Persona pete = new Persona("pete","12/6/1990");
         Persona peto = new Persona("pete","10/3/1112");
         pete.equals(peto);
         System.out.println (peto.getEdad());
        */ 
        Personaje maximus = new Personaje("maximus", 100,70);
        Personaje meximus = new Personaje("meximus", 102,93);
        Personaje moximus = new Personaje("moximus", 103,87);
        Personaje miximus = new Personaje("miximus", 190,80);
        Personaje muximus = new Personaje("muximus", 100,99);
        
        List<Personaje> listaPersonajes = new ArrayList<Personaje>();
        listaPersonajes.add (maximus);
      //  listaPersonajes.add (meximus);
      //  listaPersonajes.add (miximus);
       // listaPersonajes.add (moximus);
     //   listaPersonajes.add (muximus);
        
        for (int index = 0;index < listaPersonajes.size();index++){
            //listaPersonajes.get(index).lanzarDado();
            //System.out.println(listaPersonajes.get(index));
        }
        
     /*   for (int index = 0;index < 5;index++){
            Personaje per = new Personaje("maximus" + index, 100);
            listaPersonajes.add (per);
        }*/
        
        for(Personaje pers: listaPersonajes){
            pers.lanzarDado();
            System.out.println(pers);
        }
    }

    public static int sumeti(int sumando1, int sumando2) {
        System.out.println("sumeti: sumando numeros: " + sumando1 + " y " + sumando2);
        int resultado = sumando1 + sumando2;
        System.out.println("sumeti: Resultado: " + resultado);
        return resultado;
    }

    public static int multipli(int multi1, int multi2) {
        System.out.println("multipli: multiplicando numeros: " + multi1 + " y " + multi2);
        int inicio = 0;
        int resultado = 0;
        while (inicio < multi2) {
            resultado = sumeti(resultado, multi1);
            inicio++;
        }
        System.out.println("multipli: Resultado: " + resultado);
        return resultado;
    }

    public static int potensia(int base, int expo) {
        System.out.println("potensia: eleva una base a un exponente: " + base + " elevabo a " + expo);
        int resultado = 1;
        for (int index = 0; index < expo; index++) {

            resultado = multipli(resultado, base);
        }
        System.out.println("potensia: Resultado: " + resultado);
        return resultado;
    }
}

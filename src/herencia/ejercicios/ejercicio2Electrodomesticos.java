/*
 */
package herencia.ejercicios;

import herencia.entidades.Electrodomestico;
import herencia.entidades.Lavadora;
import herencia.entidades.Televisor;
import java.util.ArrayList;

public class ejercicio2Electrodomesticos {

    public static void main(String[] args) {
        ArrayList<Electrodomestico>electro=new ArrayList();
        
        System.out.println("----LAVADORA----");
        Lavadora lava=new Lavadora();
        lava.crearLavadora();
        System.out.println("Las caracteristicas de la lavadora son: "+ lava.toString());
        lava.precioFinal(lava);
        electro.add(lava);
        System.out.println("----------------------------------------------------------");
        System.out.println("                                                          ");
        System.out.println("----TELEVISOR----");
        Televisor tele=new Televisor();
        tele.crearTelevisor();
        electro.add(tele);
        System.out.println("Las caracteristicas del televisor son: "+ tele.toString());
        tele.precioFinal(tele);
       
        
        
    }
    
}

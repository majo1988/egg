/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia.ejercicios;

import herencia.entidades.Animal;
import herencia.entidades.Caballo;
import herencia.entidades.Gato;
import herencia.entidades.Perro;

public class ejercicio1Animales {

    public static void main(String[] args) {
       
        Animal perro=new Perro("cholo", "balanceado", 5, "caniche");
        perro.mostrarAlimento();
        
        Perro perro1= new Perro ("pepe", "carne", 2, "golden");
        perro1.mostrarAlimento();
        
        Animal gato=new Gato("mishi", "bolitas", 3, "de la calle");
        gato.mostrarAlimento();
        
        Animal caballo=new Caballo("llanero", "pasto", 10, "sin raza");
        caballo.mostrarAlimento();
        
        
        
        
    }
    
}

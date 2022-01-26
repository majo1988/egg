
package herencia.ejercicios;

import herencia.entidades.Circulo;
import herencia.entidades.Rectangulo;
import java.util.Scanner;

public class ejer4interfazformas {

    public static void main(String[] args) {
     
        Scanner leer= new Scanner (System.in);
        Circulo c1= new Circulo(0, 0, 0);
        Rectangulo r1= new Rectangulo (0, 0, 0);
        
        System.out.println("TRABAJAREMOS CON EL CIRCULO");
        System.out.println("Ingrese diametro de su circulo");
        double diametro= leer.nextDouble();
        c1.calculoArea(0, diametro);
        c1.canculoPerimetro(0, diametro);
        
        
        System.out.println("TRANAJAREMOS CON EL RECTANGULO");
        System.out.println("Ingrese base y altura de su rectangulo ");
        double base= leer.nextDouble();
        double altura= leer.nextDouble();
        r1.calculoArea(base, altura);
        r1.canculoPerimetro(base, altura);
        
    }
    
}

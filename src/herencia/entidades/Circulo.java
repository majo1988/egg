
package herencia.entidades;

import interfaces.CalculosFormas;
import java.util.Scanner;


public class Circulo implements CalculosFormas {
    
    private double diametro;
    private double radio;
    final double pi;

    public Circulo(double pi) {
        this.pi = 3.14;
    }

    public Circulo(double diametro, double radio, double pi) {
        this.diametro = diametro;
        this.radio = radio;
        this.pi = 3.14;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public void calculoArea(double radio, double diametro) {
       double radiop=diametro/2;
       double area=Math.pow(radiop,2 )*pi;
        System.out.println(" El área del circulo es " + area);
    }

    @Override
    public void canculoPerimetro(double radio, double diametro) {
       Scanner leer=new Scanner (System.in);
       double perimetro=pi*diametro;
        System.out.println("El perimetro del circulo es " + perimetro);
    }
    
    
    
    
    
}

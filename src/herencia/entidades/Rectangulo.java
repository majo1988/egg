
package herencia.entidades;

import interfaces.CalculosFormas;

public class Rectangulo  implements CalculosFormas  {
    
    private double base;
    private double altura;
    final double pi;

    public Rectangulo(double pi) {
        this.pi = 3.14;
    }

    public Rectangulo(double base, double altura, double pi) {
        this.base = base;
        this.altura = altura;
        this.pi = pi;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calculoArea(double base, double altura) {
        double area= base*altura;
        
        System.out.println("El área del rectagulo es " + area);
    }

    @Override
    public void canculoPerimetro(double base, double altura) {
        double perimetro= (base+altura) *2 ;
        System.out.println(" El perímetro del rectangulo es " + perimetro );
    }
    
    
    
}

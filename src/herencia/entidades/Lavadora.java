/*
 */
package herencia.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    
    private int carga;

    public Lavadora() {
        super();
    }
  
    public Lavadora(int carga, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

   /* Método crearLavadora (): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos el atributo propio de la lavadora.*/
    
    public void crearLavadora(){
        Scanner leer= new Scanner (System.in);
   
        super.crearElectrodomestico();
        System.out.println(" Ingrese carga del lavarropas");
        this.carga=leer.nextInt();
       
       }
   /*Si tiene una carga mayor de 30 kg, aumentará el precio en $500,
si la carga es menor o igual, no se incrementará el precio.*/ 
    
    public void precioFinal(Lavadora lava){
       int precioFinal;
       if (lava.carga>30){
           precioFinal=super.metodofinal(lava)+500;
       }
       else 
           precioFinal= super.metodofinal(lava);
        this.precio=precioFinal;
        
       // System.out.println("EL PRECIO FINAL DE LA LAVADORA ES " + lava.precio);
    }

    @Override
    public String toString() {
        return "Lavadora{" + "Carga= " + carga + ", Consumo= " + consumo + ", Precio= " + precio + ", Color= " + color +  '}';
    }

    
}
    


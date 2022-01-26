/*
 */
package herencia.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    super();}

    public Televisor(int resolucion, boolean sintonizador, int precio, String color, char consumo, int peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
    Scanner leer= new Scanner (System.in);
    //Televisor tele= new Televisor();
    super.crearElectrodomestico();
    
    System.out.println(" Ingrese Resolucion del televisor");
    this.resolucion=leer.nextInt();
    
    System.out.println("El televisor cuenta con sintonizador?");
    String siono=leer.next();
    if (siono.equals("si")){
       this.sintonizador=true; }
    else if (siono.equals("no"))
       this.sintonizador=false;
    }
    
    /*Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.*/
    public void precioFinal(Televisor tele){
        super.metodofinal(tele);
        int precioFinal;
        int preciotrei=(super.metodofinal(tele)*30)/100;
        
       if(tele.resolucion>40 ){
           precioFinal=super.metodofinal(tele)+preciotrei;}
           else 
            precioFinal=super.metodofinal(tele);
       
       if(tele.sintonizador==true){
           this.precio=precioFinal+500;}
           else 
           this.precio=precioFinal;
        }

     @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", Consumo= " + consumo + ", Precio= " + precio + ", Color= " + color +   '}';
    }
    
    
}

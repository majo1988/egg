/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
 */
package herencia.entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Electrodomestico {
    
    protected int precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    /*Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.*/
    public char comprobarConsumoEnergetico(char letra){
        char letrous;
        if(letra=='a' || letra=='b' || letra=='c'|| letra=='d'|| letra=='e'|| letra=='f'){
            letrous=letra;}
    else  
            letrous='f';
        return letrous;
    
    }
    
    /*Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.*/
    
    public String coprobarColor (String color){
        String colour;
        if (color.equals("blanco")||color.equals("negro")||color.equals("azul")||color.equals("gris")){
            colour=color;}
        else 
            colour="blanco";
    
    return colour;}
    
    /*• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.*/
    
    public void crearElectrodomestico(){
        Scanner leer=new Scanner(System.in);
        Electrodomestico elec=new Electrodomestico();
        
        System.out.println("Ingrese precio,recuerde que le precio base es de $1000");
        this.precio=leer.nextInt();
        
        System.out.println("Ingrese color");
        this.color=elec.coprobarColor(leer.next());
        
        
        System.out.println("Ingrese consumo");
        this.consumo=elec.comprobarConsumoEnergetico(leer.next().charAt(0));
        
        System.out.println("Ingrese peso ");
        this.peso=leer.nextInt();
        
       
    }
    
   /* Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:*/
    public int metodoFinala (Electrodomestico elec){
        int ppeso=0;
        
        if(elec.peso<=19){
          ppeso=100+elec.getPrecio();}
        else 
        if (elec.peso>=20 && elec.peso<49){
         ppeso=500+elec.getPrecio();}
         else 
        if (elec.peso>=50 && elec.peso<79){
         ppeso=800+elec.getPrecio();}
        else 
        if (elec.peso>=80){
         ppeso=1000+elec.getPrecio();}
    return ppeso;}
  
    public int metodofinal(Electrodomestico elec){
       //int pre=elec.metodoFinala(elec);
       int prex=0;
        if(elec.consumo=='a'){
        prex=elec.metodoFinala(elec)+1000;}
        else
        if(elec.consumo=='b'){
        prex=elec.metodoFinala(elec)+800;}
        else
        if(elec.consumo=='c'){
        prex=elec.metodoFinala(elec)+600;}
        else
        if(elec.consumo=='d'){
        prex=elec.metodoFinala(elec)+500;}
        else
        if(elec.consumo=='e'){
        prex=elec.metodoFinala(elec)+300;}
        else
        if(elec.consumo=='f'){
        prex=elec.metodoFinala(elec)+100;}
        
        return prex;}
    
     

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    
        
 }

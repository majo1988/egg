/*Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor
 */
package herencia.ejercicios;

import herencia.entidades.Electrodomestico;
import herencia.entidades.Lavadora;
import herencia.entidades.Televisor;
import java.util.ArrayList;
import java.util.Scanner;

public class ejerc3Electrodomesticosarrays {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       ArrayList<Electrodomestico>electro=new ArrayList();
       
       
       int opcion;
       int cuenta=0;
       int sumaLava=0;
       int sumaTele=0;
       
       do{
           System.out.println("-------------------------------------------------------------");
           System.out.println("Presione 1 para agragar Lavadora o 2 para agragar Televisor ");
           opcion=leer.nextInt();
           
           if(opcion==1){
           Lavadora lava=new Lavadora();
           lava.crearLavadora();
           electro.add(lava);
           lava.precioFinal(lava);
           sumaLava=lava.getPrecio()+sumaLava;
           } 
           if(opcion==2){
           Televisor tele=new Televisor();
           tele.crearTelevisor();
           electro.add(tele);
           tele.precioFinal(tele);
           sumaTele=tele.getPrecio()+sumaTele;
           }
           cuenta++;
           System.out.println("-----------------------------------------------------------");
        
          }while(cuenta<4); 
       
        System.out.println("Los electrodomesticos agregados a la lista son ");
       
         for (Electrodomestico electrodomestico : electro) {
        System.out.println(electrodomestico);
        }
         
        System.out.println("--------------------------------");
        System.out.println("SUMA DE PRECIOS DE ELECTRODOMÉSTICOS EN BASE A SU CLASE ");
        
        System.out.println(" La suma de los precios de lavadoras es de $ " + sumaLava); 
        System.out.println(" La suma de los precios de los televisores es de $ " + sumaTele);
        
    } 
       }


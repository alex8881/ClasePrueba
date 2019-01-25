/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosprueba;

import java.util.Scanner;

/**
 *
 * @author ALEX
 */
public class ProductosPrueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner teclado=new Scanner(System.in);
        
        Productos basemp=new Productos();
        
        tipo dir=new tipo("Verduras 5%", "Lacteos 20%", "Protenias 10%");
        tipo x = null;
        TipoProductos x1=new TipoProductos ("leche","785-xf ", "10" ,x);
        TipoProductos  x2=new TipoProductos ("carne","156805-xf ","15",x);
        basemp.insertarProductos(x1);
        basemp.insertarProductos(x2);
        basemp.imprimirProductos();
        
//Eliminar
        System.out.println("Eliminar");
        basemp.eliminarProductos(x1);
        basemp.imprimirProductos();

        //Buscar
        System.out.println("Buscar");
        basemp.buscarProductos("785-xf");

        //modificar
        System.out.println("Modificar");
        System.out.println("1. Modificar NombreProducto: ");
        System.out.println("2. Modificar CodigoProducto: ");
        System.out.println("3. Modificar PrecioPructo: ");
        System.out.print("Elija una opcion: ");
        int op=teclado.nextInt();
        switch(op){
            case 1: 
                System.out.println("Ingrese el nombre: ");
                String nombre=teclado.next();
             
                basemp.imprimirProductos();
                break;
            case 2:
                break;
            case 3:
                System.out.println("Ingrese el nuevo tipo: ");
                String tip=teclado.next();
                break;
        }
        
    }
}
    
    


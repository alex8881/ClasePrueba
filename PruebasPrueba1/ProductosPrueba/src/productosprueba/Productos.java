/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productosprueba;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ALEX
 */
public class Productos {
    ArrayList <TipoProductos> listaProductos=new ArrayList();
//    'ArrayList <String> paises=new ArrayList();'

    public void insertarProductos( TipoProductos insemp){
        listaProductos.add(insemp);
    }
    //Imprimir empleado
    public void imprimirProductos (){//no envia parametro porque solo recorre
        Iterator it1=listaProductos.iterator();  //Descompone la lsista empleado para pasar uno a uno
        while(it1.hasNext()){
            TipoProductos empl=(TipoProductos)it1.next();
            System.out.println("Imprimiendo: "+empl.toString());
        }
    }
    //Eliminar 
    public void eliminarProductos(TipoProductos eliemp){
       listaProductos.remove(eliemp);
        
    }
    //buscar por ide
    public void buscarProductos(String cedula){
        boolean op=false;
        Iterator it2=listaProductos.iterator();
        while(it2.hasNext()){
            TipoProductos emp=(TipoProductos)it2.next();
            if(emp.getCodigo().equals(cedula)){
            System.out.println("Imprimiendo: "+emp.toString()); 

            op=true;
            }
        }
        if(op==false){
            System.out.println("No se encuentra producto a buscar");
        }
    }
    //Modificar empleado
    public void modificarProductos(int opDato, String dato ,String tipo){
        Iterator it2=listaProductos.iterator();
        while(it2.hasNext()){
            TipoProductos emp=( TipoProductos )it2.next();
            if(emp.getCodigo().equals(tipo)){
                switch(opDato){
                    case 1:
                        emp.setNombre(dato);
                        break;
                    case 2:
                       // emp.getDir(null);
                        break;
                    case 3:
                        emp.getProducto(dato);
                        break;
                }

            }
        }

    }

  
}

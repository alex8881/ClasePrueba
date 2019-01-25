
package pruebasunitarias;

import java.util.Scanner;

public class PruebasUnitarias {

    public static void main(String[] args) {
   

        float resultado, num1, num2;
         
        Scanner teclado=new Scanner(System.in);
        Operaciones op=new Operaciones();
            int opc; 
        do{
        System.out.println("Ingrese valor 1:");
        num1=teclado.nextFloat();
        
        System.out.println("Ingrese valor 2:");
        num2=teclado.nextFloat();
        
 
        
            System.out.println("1. SUMA");
            System.out.println("2. RESTA");
            System.out.println("3. MULTIPLICACIO");
            System.out.println("4. DIVISION");
            
            System.out.println("Elija el item que desee:");
            opc=teclado.nextInt();
         
     switch(opc){  
        case 1:      
        resultado=op.Suma(num1,num2);
        System.out.println("LA SUMA ES:"+resultado);
        break;
     
        case 2:
        resultado=op.Resta(num1,num2);
        System.out.println("LA RESTA ES:"+resultado);
        break;
        
        case 3:
         resultado=op.Multiplicacion(num1,num2);
        
         System.out.println("EL MULTIPLICACION ES:"+resultado);
        break;
        case 4:
          resultado=op.Division(num1,num2);
        
         System.out.println("EL DIVISION ES:"+resultado); 
        break;
     }
        }while(opc!=5);
        }

}


package algoritmo;

import java.util.Scanner;




public class Calculadora1  {

   public static void main(String[] args) {
     int nro1,nro2,resul = 0;
       String ope;
       ope = "";
       System.out.println("Ingrese el 1er. nro");
       Scanner ingreso = new Scanner(System.in);
       nro1 = ingreso.nextInt();
       System.out.println("Ing, el 2di, nro");
       nro2 = ingreso.nextInt();
       System.out.println("Ing. el operador");
       ope = ingreso.next();
       if(ope.equals("+")){
           resul = nro1 + nro2;
       }else if(ope.equals("-")){
               resul = nro1 - nro2;
       }else if(ope.equals("*")){
           resul = nro1 * nro2;
       }else if(ope.equals("/")){
           while (nro2 == 0 ){
               System.out.println("Monse, Ingresa un nro. distinto de 0");
               nro2 = ingreso.nextInt();
               }
               resul = nro1 / nro2;
           }
               
       System.out.println("El resultado es :" + resul);
     
   }
       
       
   
}
package algoritmo;

import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        int nro1=0, nro2=0; Double resultado = 0.0;
        char ope;
        System.out.println("Ingresa el número1");
        nro1 = ingreso.nextInt();
        System.out.println("Ingresa el segundo número");
        nro2 = ingreso.nextInt();
        System.out.println("Ingresa el operador");
        ope = ingreso.next().charAt (0);
        switch(ope){
            case '+': resultado = (double) (nro1 + nro2); break;
            case '-': resultado = (double) (nro1 - nro2); break;
            case '*': resultado = (double) (nro1 * nro2); break;
            case '/': resultado = (double) (nro1 / nro2); break;
        }
        System.out.println("El resultado es :" + resultado);
    }
}

package algoritmo;

import java.util.Scanner;

public class Calculadora3 {
    public static void main(String[] args) {
        Scanner ingreso = new Scanner (System.in);
        int condición = 1;
        Double nro1, nro2, resultado = 0.0;
        char ope;
        System.out.println("Ingresa el primer número");
        nro1 = ingreso.nextDouble();
        while (condición == 1){
            System.out.println("Ingresa el operador");
            ope = ingreso.next().charAt (0);
            System.out.println("Ingresa el siguiente número");
            nro2 = ingreso.nextDouble();
            switch(ope){
                case '+': resultado = (double) (nro1 + nro2); break;
                case '-': resultado = (double) (nro1 - nro2); break;
                case '*': resultado = (double) (nro1 * nro2); break;
                case '/': resultado = (double) (nro1 / nro2); break;
        }
            System.out.println("Deseas seguir: SI-1, NO-2");
            condición = ingreso.nextInt();
            nro1 = resultado;
            System.out.println("El resultado es :" + resultado);
    }
    }
}

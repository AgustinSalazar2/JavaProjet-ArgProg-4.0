package ejercicio1;

import java.util.Scanner;

import static ejercicio1.Funciones.ordenAscDesc;

public class OrdenPuntoB {
    public static void main(String[] args) {
        System.out.println("Punto B Ingrese 3 numeros enteros e ingrese asc|desc para ordenar de manera ascendente o descendente");
        Scanner scan = new Scanner(System.in);

        String orden = "",
                num1 = "",
                num2 = "",
                num3 = "";

        System.out.println("Ingrese el primer numero: ");
        num1 = scan.nextLine();
        System.out.println("Ingrese el segundo numero: ");
        num2 = scan.nextLine();
        System.out.println("Ingrese el tercer numero: ");
        num3 = scan.nextLine();
        System.out.println("Ingrese el orden 'asc' o 'desc' :");
        orden = scan.nextLine();

        System.out.println("Ordenados: "+funct(num1,num2,num3,orden));
    }
    private static String funct(String num1,String num2,String num3,String orden){
        String res = ordenAscDesc(num1,num2,num3,orden);
        return res;
    }

}

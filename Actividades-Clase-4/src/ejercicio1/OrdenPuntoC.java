package ejercicio1;

import java.util.Scanner;

import static ejercicio1.Funciones.ordenAscDesc;

public class OrdenPuntoC {
    public static void main(String[] args) {

        String orde = "",
                num1 = "",
                num2 = "",
                num3 = "";
        if(args.length != 4) {
            System.out.println("Ingrese 3 numeros enteros e ingrese asc|desc para ordenar de manera ascendente o descendente");
            Scanner scan = new Scanner(System.in);

            System.out.println("Ingrese el primer numero: ");
            num1 = scan.nextLine();
            System.out.println("Ingrese el segundo numero: ");
            num2 = scan.nextLine();
            System.out.println("Ingrese el tercer numero: ");
            num3 = scan.nextLine();
            System.out.println("Ingrese el orden 'asc' o 'desc' :");
            orde = scan.nextLine();
            System.out.println(ordenAscDesc(num1,num2,num3,orde));
        } else {
            num1 = args[0];
            num2 = args[1];
            num3 = args[2];
            orde = args[3];

            System.out.println(ordenAscDesc(num1,num2,num3,orde));
        }
    }
}

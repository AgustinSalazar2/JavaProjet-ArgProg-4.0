package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Orden {
    public static void main(String[] args) {

        if(args.length == 4) {
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            int num3 = Integer.parseInt(args[2]);
            String orden = args[3];

            int[] numeros = new int[]{num1,num2,num3};
            ordenAscDesc(numeros,orden);
        } else {
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

            int[] numeros = new int[]{Integer.parseInt(num1),Integer.parseInt(num2),Integer.parseInt(num3)};
            ordenAscDesc(numeros,orden);
        }


    }
    public static void ordenAscDesc(int[] arrayNumeros, String tipoOrden) {
        if(tipoOrden.equals("asc")){
            Arrays.sort(arrayNumeros);
        } else if (tipoOrden.equals("desc")) {
            Arrays.sort(arrayNumeros);
            int i = 0;
            int j = arrayNumeros.length -1;
            while (i < j) {
                int temp = arrayNumeros[i];
                arrayNumeros[i] = arrayNumeros[j];
                arrayNumeros[j] = temp;
                i++;
                j--;
            }
        } else {
            System.out.println("Tipo de ordenamiento no valido");
            return;
        }
        System.out.println("Numeros ordenados de manera "+tipoOrden+": " + Arrays.toString(arrayNumeros));
    }
}

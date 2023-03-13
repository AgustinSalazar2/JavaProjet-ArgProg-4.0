package ejercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        System.out.println("Ingrese 3 numeros enteros e ingrese asc|desc para ordenar de manera ascendente o descendente");
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

        System.out.println(ordenAscDesc(num1,num2,num3,orden));

    }
    public static String ordenAscDesc(String num1,String num2,String num3,String orden) {

        int numero1 = Integer.parseInt(num1);
        int numero2 = Integer.parseInt(num2);
        int numero3 = Integer.parseInt(num3);

        int numeros[] = new int[]{numero1,numero2,numero3};

        if(orden.equals("asc")){
            Arrays.sort(numeros);
        } else if (orden.equals("desc")) {
            Arrays.sort(numeros);
            int i = 0;
            int j = numeros.length -1;
            while (i < j) {
                int temp = numeros[i];
                numeros[i] = numeros[j];
                numeros[j] = temp;
                i++;
                j--;
            }
        } else {
            return "Ordenamiento no valido";
        }
        return Arrays.toString(numeros);
    }
}

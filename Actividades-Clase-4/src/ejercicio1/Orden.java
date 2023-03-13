package ejercicio1;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Orden {
    public static void main(String[] args) {
        // Punto a
        if(args.length != 4) {
            System.out.println("Ingrese: num1 num2 num3 asc|desc");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        String orden = args[3];

        int[] numeros = new int[]{num1,num2,num3};
        Arrays.sort(numeros);
        if(orden.equals("asc")){
            Arrays.sort(numeros);
            //System.out.println("Ordenado de manera ascendente: "+ numeros);
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
            System.out.println("Ordenamiento no valido");
            return;
        }
        System.out.println("Numeros ordenados: " + Arrays.toString(numeros));
    }
}

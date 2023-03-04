import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array y String
        // ***DESCOMENTAR PARA IR PROBANDO***

        //a_ Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String
        String palabra = "Automovil";
        String letra = "o";

        String palabraEnMiniscula = palabra.toLowerCase();
        String letraEnMinuscula = letra.toLowerCase();

        if (palabraEnMiniscula.contains(letraEnMinuscula)){
            int cantidad = 0;
            for (int i = 0;i < palabraEnMiniscula.length(); i++){
                String caracter = String.valueOf(palabraEnMiniscula.charAt(i));
                if (letraEnMinuscula.equals(caracter)){
                    cantidad++;
                }
            }
            //System.out.println(cantidad);
        } else {
            //System.out.println("La letra no aparece en la palabra");
        }

        //b_ Dados 3 números y un orden (ascendente o decreciente) que ordene los mismos y los retorne en un vector de 3
        int num1 = 5;
        int num2 = 20;
        int num3 = 3;
        boolean ordenAscendente = true;     // true (ascendente) y false (descendente)
        int numOrdenados[] = new int[3];
        
        if (ordenAscendente){
            if (num1<=num2 && num2<=num3){
                numOrdenados[0] = num1;
                numOrdenados[1] = num2;
                numOrdenados[2] = num3;
            } else if (num1<=num3 && num3<=num2) {
                numOrdenados[0] = num1;
                numOrdenados[1] = num3;
                numOrdenados[2] = num2;
            } else if (num2<=num1 && num1<=num3) {
                numOrdenados[0] = num2;
                numOrdenados[1] = num1;
                numOrdenados[2] = num3;
            } else if (num2<=num3 && num3<=num1) {
                numOrdenados[0] = num2;
                numOrdenados[1] = num3;
                numOrdenados[2] = num1;
            } else if (num3<=num1 && num1<=num2) {
                numOrdenados[0] = num3;
                numOrdenados[1] = num1;
                numOrdenados[2] = num2;
            } else {
                numOrdenados[0] = num3;
                numOrdenados[1] = num2;
                numOrdenados[2] = num1;
            }
        }else {
            if (num1>=num2 && num2>=num3){
                numOrdenados[0] = num1;
                numOrdenados[1] = num2;
                numOrdenados[2] = num3;
            } else if (num1>=num3 && num3>=num2) {
                numOrdenados[0] = num1;
                numOrdenados[1] = num3;
                numOrdenados[2] = num2;
            } else if (num2>=num1 && num1>=num3) {
                numOrdenados[0] = num2;
                numOrdenados[1] = num1;
                numOrdenados[2] = num3;
            } else if (num2>=num3 && num3>=num1) {
                numOrdenados[0] = num2;
                numOrdenados[1] = num3;
                numOrdenados[2] = num1;
            } else if (num3>=num1 && num1>=num2) {
                numOrdenados[0] = num3;
                numOrdenados[1] = num1;
                numOrdenados[2] = num2;
            } else {
                numOrdenados[0] = num3;
                numOrdenados[1] = num2;
                numOrdenados[2] = num1;
            }
        }

        for (int i=0;i<numOrdenados.length;i++){
            //System.out.println(numOrdenados[i]);
        }

        //c_ dado un vector de números, y un número X, que sume todos los números > X y retorne el resultado
        // Suma los números mayores a numeroX.
        int vectorNumeros[] = new int[]{8,4,22,5,10,6};
        int numeroX = 7;
        int acumulador = 0;
        for (int i=0;i < vectorNumeros.length;i++){
            if (vectorNumeros[i] > numeroX){
                acumulador = acumulador + vectorNumeros[i];
            }
        }
        //System.out.println(acumulador);

        // Suma numeroX a cada elemento del vector:
        int nuevoVector[] = new int[vectorNumeros.length];
        for (int i=0;i < vectorNumeros.length;i++){
            nuevoVector[i] = vectorNumeros[i] + numeroX;
        }

        for (int i=0;i < vectorNumeros.length;i++){
            //System.out.println(vectorNumeros[i] +" ----> "+ nuevoVector[i]);
        }

        //***********************************************************************
        // 2 _ Genere una clase que tenga los métodos para realizar la codificación y decodificación de un string, dado un número de desplazamiento.

        String abecedario = "abcdefghijklmnñopqrstuvwxyz #¿?!¡,ABCDEFGHIJKLMNÑOPQRSTUVWXYZ*/1234567890";
        int longABC = abecedario.length();
        String mensajeACodificar = "Hola que tal!";
        int desplazamiento = 2;
        System.out.println("Mensaje original: "+mensajeACodificar);

        //Para codificar
        char vectorCodificado[] = new char[mensajeACodificar.length()];

        for (int i=0;i < mensajeACodificar.length();i++){
            if (abecedario.contains(String.valueOf(mensajeACodificar.charAt(i)))){
                for (int j=0;j < longABC;j++){
                    if (mensajeACodificar.charAt(i) == abecedario.charAt(j)){
                        vectorCodificado[i] = abecedario.charAt(j+desplazamiento);
                        break;
                    }
                }
            }else {
                vectorCodificado[i] = '@';
            }
        }

        String mensajeCodif = new String(vectorCodificado);
        System.out.println("Mensaje codificado: "+mensajeCodif);

        //Para decodificar
        char vectorDecodificado[] = new char[mensajeCodif.length()];

        for (int i=0;i < mensajeCodif.length();i++){
            if (abecedario.contains(String.valueOf(mensajeCodif.charAt(i)))){
                for (int j=0;j < longABC;j++){
                    if (mensajeCodif.charAt(i) == abecedario.charAt(j)){
                        vectorDecodificado[i] = abecedario.charAt(j-desplazamiento);
                    }
                }
            }else {
                vectorCodificado[i] = ' ';
            }
        }

        String mensajeDecodif = new String(vectorDecodificado);
        System.out.println("Mensaje decofidicado: "+mensajeDecodif);
    }
}
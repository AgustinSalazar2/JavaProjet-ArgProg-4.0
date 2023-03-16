package ejercicio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
//import java.nio.file.Path;


public class Calculos {
    public static void main(String[] args) throws IOException {

        if (args.length != 2){
            System.out.println("Ingrese: <ruta del archivo> <suma||multi>");
            return;
        }
        String archivo = args[0];
        String operacion = args[1];
        //String archivo = "D:\\Users\\Agustin\\Escritorio\\JavaInicial-Arg-Prog\\JavaProjet-ArgProg-4.0\\Actividades-Clase-4\\numeros.txt";

        int resultado = 0;
        int arrayNum[] = new int[args.length];

        if (operacion.equals("suma")){
            for (String linea : Files.readAllLines(Paths.get(archivo))){
                resultado = resultado + Integer.parseInt(linea);
                System.out.println(linea);
            }
            System.out.println(resultado);
        } else if (operacion.equals("multi")) {
            int i = 0;
            for (String linea : Files.readAllLines(Paths.get(archivo))){
                arrayNum[i] = Integer.parseInt(linea);
                i++;
            }
            resultado = arrayNum[0] * arrayNum[1];
            System.out.println(resultado);
        }

    }
}

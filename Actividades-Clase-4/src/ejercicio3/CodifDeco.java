package ejercicio3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CodifDeco {
    public static void main(String[] args) throws IOException {
        String abecedario = "abcdefghijklmnñopqrstuvwxyz #¿?!¡,ABCDEFGHIJKLMNÑOPQRSTUVWXYZ*/1234567890";
        int longABC = abecedario.length();
        if (args.length != 4){
            System.out.println("Ingrese: <cod||deco> <desplazo> <archivoEntrada> <archivoSalida>");
            return;
        }

        String codDeco = args[0];
        int desplazo = Integer.parseInt(args[1]);
        String fileEntrada = args[2];
        String fileSalida = args[3];

        String mensajeACodificar = "";
        for (String linea : Files.readAllLines(Paths.get(fileEntrada))){
            mensajeACodificar = linea;
//            System.out.println(linea);
        }

        //Para codificar
        char vectorCodificado[] = new char[mensajeACodificar.length()];

        if (codDeco.equals("cod")){
            for (int i=0;i < mensajeACodificar.length();i++){
                if (abecedario.contains(String.valueOf(mensajeACodificar.charAt(i)))){
                    for (int j=0;j < longABC;j++){
                        if (mensajeACodificar.charAt(i) == abecedario.charAt(j)){
                            vectorCodificado[i] = abecedario.charAt(j+desplazo);
                            break;
                        }
                    }
                }else {
                    vectorCodificado[i] = '@';
                }
            }

            String mensajeCodif = new String(vectorCodificado);
            Files.writeString(Paths.get(fileSalida), mensajeCodif);
            System.out.println("Mensaje Codificado con exito");

        } else if (codDeco.equals("deco")) {
            for (int i=0;i < mensajeACodificar.length();i++){
                if (abecedario.contains(String.valueOf(mensajeACodificar.charAt(i)))){
                    for (int j=0;j < longABC;j++){
                        if (mensajeACodificar.charAt(i) == abecedario.charAt(j)){
                            vectorCodificado[i] = abecedario.charAt(j-desplazo);
                            break;
                        }
                    }
                }else {
                    vectorCodificado[i] = ' ';
                }
            }

            String mensajeCodif = new String(vectorCodificado);
            Files.writeString(Paths.get(fileSalida), mensajeCodif);
            System.out.println("Mensaje Decodificado con exito");
        } else {
            System.out.println("Ingrese: <cod> || <deco> de manera correcta");
        }

    }
}

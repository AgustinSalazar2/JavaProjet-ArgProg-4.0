import carrito.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        String archivo = "D:\\Users\\Agustin\\Escritorio\\JavaInicial-Arg-Prog\\JavaProjet-ArgProg-4.0\\Actividades-Clase-5\\listaDeProductos.txt";
        if (args.length == 100){
            System.out.println("no anda");
        }
        Carrito carrito = new Carrito();

        for (String linea : Files.readAllLines(Paths.get(archivo))){
            String[] items = linea.split(",");
            //System.out.println(items[2]);
            Producto producto = new Producto(items[2], Float.parseFloat(items[1]), Integer.parseInt(items[0]));
            carrito.agregarItem(producto, Integer.parseInt(items[0]));
        }
        System.out.println("Precio total: $" + carrito.getPrecioTotal());
    }
}
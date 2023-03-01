public class Main {
    public static void main(String[] args) {
        //  Introducción a algoritmos y java

        //  Actividad 1:
        // *** Descomentar para probar cada punto ***

        //a_
        int numInicio = 5;
        int numFin = 14;
        //while (numInicio <= numFin) {
        //     System.out.println(numInicio);
        //     numInicio += 1;
        // }

        //b
        //while (numInicio <= numFin) {
        //     if (numInicio % 2 == 0){
        //         System.out.println(numInicio);
        //     }
        //     numInicio += 1;
        // }

        //c
        //boolean mostrarPares = true;  //Si mostrarPares esta en true muestra los números pares, si esta en false muestra los impares.
        // while (numInicio <= numFin) {
        //     if (mostrarPares){
        //         if (numInicio % 2 == 0){
        //             System.out.println(numInicio);
        //         }
        //     } else {
        //         if (numInicio % 2 != 0){
        //             System.out.println(numInicio);
        //         }
        //     }
        //     numInicio += 1;
        // }

        //d
        //for (int otroNumFin=14;otroNumFin >= numInicio;otroNumFin--){
        //     System.out.println(otroNumFin);
        // }

        //***************************************************************************************

        //Actividad 2:
        // *** Puede cambiar estas variables para ir probando ***

        float ingresoTotal = 489083;  //Ingresos mensuales totales del hogar
        int cantidadVehiculos = 2;    //Cantidad de vehiculos con antigüedad menor a 5 años
        int cantidadInmuebles = 2;    //Cantidad de inmuebles
        boolean embarcacion = false;     //¿Posee una embarcacion?
        boolean aeronaveDeLujo = false;  //¿Posee aeronave de lujo?
        boolean titularActivosSocietarios = false;  //¿Es titular de activos societarios?

        if ((ingresoTotal >= 489083) || (cantidadVehiculos >= 3) || (cantidadInmuebles >= 3) || (embarcacion || aeronaveDeLujo || titularActivosSocietarios)){
            System.out.println("Usted pertenece al segmento de ingresos altos");
        } else {
            System.out.println("Usted no pertenece al segmento de ingresos altos");
        }

    }
}
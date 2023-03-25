package actividades;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // 1_ El resultado de multiplicar 80 por 3 da 240

        double result1 = calculadora.multiplicar(80, 3);
        //assertEquals(result1, 240);       //Descomentar para probar


        // 2_ El resultado de sumar 150 y 180, dividido por 3, da 110

        double result2 = calculadora.sumar(150, 180);
        result2 = calculadora.dividir(result2, 3);
        //assertEquals(result2, 110);       //Descomentar para probar


        // 3_ El resultado de restar 90 y 50, multiplicado por 15, no da 605

        double result3 = calculadora.restar(90, 50);
        result3 = calculadora.multiplicar(result3, 15);
        //assertEquals(result3, 605);       //Descomentar para probar


        // 4_ El resultado de sumar 70 y 40, multiplicado por 25, no da 2700

        double result4 = calculadora.sumar(70, 40);
        result4 = calculadora.multiplicar(result4, 25);
        //assertEquals(result4, 2700);      //Descomentar para probar

    }
    private static void assertEquals(double actual, double expected) {
        if (actual != expected) {
            throw new RuntimeException(actual+" es distinto de "+expected);
        }
    }
}

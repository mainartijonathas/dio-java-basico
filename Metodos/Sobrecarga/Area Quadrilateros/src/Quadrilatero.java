/*
 Classe com os métodos que calculam a área dos quadrilateros, Quadrado, Retangulo e Trapézio
 */

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Area do quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Area do retangulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Area do Trapezio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

}
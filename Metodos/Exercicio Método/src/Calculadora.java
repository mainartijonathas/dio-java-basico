import java.net.SocketTimeoutException;

/*
Classe de exemplo para o exercício da Aula 1 de Métodos
 */

 public class Calculadora {

    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + "+" + numero2 + " = " + resultado);
    }

    public static void subitracao( double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subitração de " + numero1 + "-" + numero2 + " = " + resultado);
    }
       
    public static void multiplicacao( double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A multiplicação de " + numero1 + "x" + numero2 + " = " + resultado);
    }

    public static void divisao( double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A divisão de " + numero1 + "/" + numero2 + " = " + resultado);
    }

 }
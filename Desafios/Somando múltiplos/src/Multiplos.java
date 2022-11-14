import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args) throws Exception {
        
        int A,N;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        N = input.nextInt();

        int qtdMultipos = N / A;
        int soma = ((A + N)*qtdMultipos)/2;
        System.out.println(soma);
    }
}

import java.util.Scanner;

/*
/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuda de qualquer
número inteiro entre 1 e 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser confomer exemplo abaixo:
Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
 */

public class Ex5_Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número no qual deseja a tabuada: ");

        int tabuada = scan.nextInt();

        System.out.println("A tabuada de: " + tabuada);

        for( int i = 1; i <= 10; i++ )  {
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
        
    }
}

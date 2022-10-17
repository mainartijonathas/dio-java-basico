import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

/*
 Faça um programa que leia 5 números e informe o maior número
 e a média desses números.
 */
public class Ex3_MaiorEMedia {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        float soma = 0f;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)
                maior = numero;

            count = count + 1;

        } while (count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é " + soma / 5);
    }
}

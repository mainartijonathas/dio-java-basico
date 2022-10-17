import java.util.Scanner;

import javax.lang.model.element.QualifiedNameable;

/*
 Faça um programa que peça N números inteiros, 
 calcule e mostre a quantidade de númeoros pares
 e a quantidade de números ímpares.
 */
public class Ex4_ParEImpar {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int qtdPar = 0;
        int qtdImpar = 0;

        System.out.println("Quanidade de números a ser calculados? ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {

            System.out.println("Insira o número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0)
                qtdPar++;
            else
                qtdImpar++;

            count++;

        } while (count < quantNumeros);

        System.out.println("Quantidade de números pares é: " + qtdPar);
        System.out.println("A  quantidade de números ímpares é: " + qtdImpar);
    }
}

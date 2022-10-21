import java.util.Random;

/*
Faça um programa que leia 20 numeros inteiros aleatórios (entre 0 e 100)
armazene-os num vetor. Ao final mostre os numeros e seus sucessores.
 */
public class Ex3_NumerosAleatorios {
    public static void main(String[] args) throws Exception {
      
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("Numero Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");

        }

        System.out.print("\nNumero sucessor: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero+1) +" ");
        }
    }
}

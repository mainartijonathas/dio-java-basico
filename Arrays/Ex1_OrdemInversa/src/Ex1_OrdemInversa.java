/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
 */
public class Ex1_OrdemInversa {
    public static void main(String[] args) throws Exception {
        
        int [] vetor = {1, 3, 10, 6, 9, 20};
                
        /* .length é uma propriedade do vetor que mostra 
        o tamanho do meu vetor, ou seja, 
        quantos elementos ele pode armazenar.
        */
        System.out.println("Vetor: ");
        int count = 0;
        while(count < (vetor.length)) {

            System.out.println(vetor[count] + " ");
            count++;
        }

        System.out.println("\nVentor na ordem inversa");
        for(int i = (vetor.length - 1); i >= 0; i-- ) {
            System.out.println(vetor[i] + " ");
        }
    }
}

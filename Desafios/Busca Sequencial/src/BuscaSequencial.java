import java.util.*;

public class BuscaSequencial {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 
        int numero = 0;
        int i = 0;
        boolean x = false;

        numero = leitor.nextInt();
        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        do{
          if(  numero == elementos[i]){
            System.out.println("Achei "+elementos[i]+" na posicao "+i);
            x = true;
          }
          i++;
        }while(i<elementos.length);

        if(!x){
           System.out.println("Numero "+numero+" nao encontrado!");
        }
    }
}
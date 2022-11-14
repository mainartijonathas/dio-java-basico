import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {

    // TODO: Imprima se os valores numéricos passados são iguais ou não.
    Scanner scan = new Scanner(System.in);
    int nunero1;
    int numero2;

    nunero1 = scan.nextInt();
    numero2 = scan.nextInt();

    if (nunero1 == numero2)
      System.out.println("Sao iguais!");
    else
      System.out.println("Nao sao iguais!");
  }
}

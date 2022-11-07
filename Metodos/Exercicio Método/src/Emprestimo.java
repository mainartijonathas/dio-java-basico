import java.security.Principal;

import javax.lang.model.util.ElementScanner14;

/*
Classe de Exemplo para o Exercício da Aula 1 de Métodos - Simular empréstimo com Juros
 */
public class Emprestimo {

    public static int getDuasParcela() {
        return 2;
    }

    public static int getTresParcela() {
        return 3;
    }

    public static double getTaxaDuasParcelas() {
        return 0.3;
    }

    public static double getTaxaTresParcelas() {
        return 0.45;
    }

    public static void calcular(double valor, int parcela) {
        if (parcela == 2) {
            double valorFinal = valor + (valor * getTaxaDuasParcelas());
            System.out.println("Valor final do empréstimo em dua parcelas é: R$" + valorFinal);
        } else if (parcela == 3) {
            double valorFinal = valor + (valor*getTaxaTresParcelas());
            System.out.println("Valor dinal do empréstimo em três parcelas é R$" + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas indevida");
        }
    }
    
}
 
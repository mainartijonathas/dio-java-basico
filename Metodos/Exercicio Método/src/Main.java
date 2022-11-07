/*
Classe principal dos exercícios da Aula 1 de Métodos.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        // calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 6);
        Calculadora.subitracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(22);

        //Emprestimo
        System.out.println("Exercício emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcela());
        Emprestimo.calcular(1000, Emprestimo.getTresParcela());
        Emprestimo.calcular(1000, 5);
        
    }
}

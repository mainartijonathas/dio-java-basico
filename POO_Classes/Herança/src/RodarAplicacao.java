class RodarAplicacao {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcast    
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcast vai dar erro pois nem todas as informações presentes na Classe vendedor estão presentes em Funcionários devemos evitar o uso
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
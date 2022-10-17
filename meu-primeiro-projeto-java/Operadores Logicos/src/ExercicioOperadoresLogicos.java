public class ExercicioOperadoresLogicos {
    public static void main(String[] args) throws Exception {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        boolean b4 = false;

        // Conjunção = AND(e) representado por &&
        // Dijunção = OR(ou) representado por ||
        // Dijunção exclusiva = XOR representado por ^
        // Negação = NOT(contrario) representado por !

        System.out.println("Verdadeiro && Falso " + (b1 && b2));
        System.out.println("Verdadeiro && Verdadeeiro " + (b1 && b3));

        System.out.println("Falso || Verdadeiro " + (b2 || b3));
        System.out.println("Falso || Falso " + (b2 || b4));

        System.out.println("Verdadeiro ^ Verdadeiro " + (b1 ^ b3));
        System.out.println("Falso ^ Verdadeiro " + (b4 ^ b1));

        System.out.println(!b1);
        System.out.println(!b2);

        int i1 = 10;
        int i2 = 5;
        float f1 = 20f;
        float f2 = 50f;

        System.out.println("((10 + 5)<(50+20)) && Verdadeiro " + (((i1 + i2) < (f2 - f1)) && true));
        System.out.println("(10 > 5) || (50 < 20)" + ((i1 > i2) || (f2 < f1)));

        double salarioMensal = 11893.58d;
        double mediaSalario = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        System.out.println((salarioMensal < mediaSalario) && (quantidadeDependentes >= mediaDependentes));

        boolean salarioBaixo = salarioMensal < mediaSalario;
        boolean muitosDependentes = quantidadeDependentes >= mediaDependentes;

        System.out.println((salarioBaixo) && (muitosDependentes));

        boolean recebeAuxilio = (salarioBaixo) && (muitosDependentes);
        System.out.println("Recebe Auxilio " + recebeAuxilio);

    }
}

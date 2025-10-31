public class MinhaClasses2 {
    public static void main(String[] args) {
        final String NM = "Luiz Henrique";
        double MT = 1.80;
        int ANOS_DE_VIDA = 20;
        int ANO_2025 = 2025;
        System.out
                .print("Ola me chamo " + NM
                        + "\n" + "Tenho " + MT + " de altura"
                        + "\n" + "Tenho " + ANOS_DE_VIDA + " anos de idade"
                        + "\n" + "Estou realizando o curso da DIO.ME de Java Básico no ano " + ANO_2025);

        // Declarações inválidas de variáveis em Java
        // int numero&um = 1; //Os únicos símbolos permitidos são _ e $
        // int 1numero = 1; //Uma variável não pode começar com um número
        // int numero um = 1; //Não pode ter espaços bno nome da variável
        // int long = 1; //long faz parte das palagras reservadas da linguabem

        // Correção das declarações inválidas de variáveis em Java
        // int numero$um = 1;
        // int numero_um = 1;
        // int numero1 = 1;
        // int numeroum = 1;
        // int longo = 1;
    }

}

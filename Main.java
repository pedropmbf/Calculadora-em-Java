import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        operacoes ops = new operacoes();

        int escolha;

        System.out.println("Escolha uma Operacao para ser realizada: \n" +
                "\n1- Soma" +
                "\n2- Subtracao" +
                "\n3- Divisao" +
                "\n4- Multiplicacao"
        );

        escolha = sc.nextInt();

        if (escolha == 1) {
            ops.somaCalculadora();
        } else if (escolha == 2) {
            ops.subtracaoCalculadora();
        } else if (escolha == 3) {
            ops.divisaoCalculadora();
        } else if (escolha == 4) {
            ops.multiplicacaoCalculadora();
        }

    sc.close();
    }
}
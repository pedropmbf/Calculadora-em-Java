import java.util.Scanner;

public class operacoes {
    Scanner sc = new Scanner(System.in);

    public void somaCalculadora (){
        long valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextLong();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextLong();

        long soma = valor1 + valor2;

        System.out.println("Resultado: " + soma);
    }

    public void divisaoCalculadora (){
        long valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextLong();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextLong();

        long divisao = valor1/valor2;

        System.out.println("Resultado: " + divisao);
    }

    public void multiplicacaoCalculadora (){
        long valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextLong();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextLong();

        long multiplicacao = valor1*valor2;

        System.out.println("Resultado: " + multiplicacao);
    }

    public void subtracaoCalculadora (){
        long valor1, valor2;

        System.out.println("Digite o primeiro valor: ");
        valor1 = sc.nextLong();
        System.out.println("Digite o segundo valor: ");
        valor2 = sc.nextLong();

        long subtracao = valor1-valor2;

        System.out.println("Resultado: " + subtracao);
    }

}

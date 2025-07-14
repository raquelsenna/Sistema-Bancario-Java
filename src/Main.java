import br.com.raquel.sistemabancario.model.OperacaoBancaria;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperacaoBancaria operacao = new OperacaoBancaria();
        Scanner input = new Scanner(System.in);

        int resposta;
        double valorSaque;
        double valorDeposito;

        String menu = """
                =====MENU=====
                [1] Saldo
                [2] Saque
                [3] Deposito
                [4] Sair
                ==============
                """;

        while (true) {
            System.out.println(menu);
            resposta = input.nextInt();

            if(resposta == 1) {
                System.out.printf("Saldo: R$ %.2f\n", operacao.getSaldo());

            } else if(resposta == 2) {
                System.out.println("Saque: ");
                valorSaque = input.nextDouble();

                operacao.operacaoSacar(valorSaque);


            } else if (resposta == 3) {
                System.out.println("Deposito: ");
                valorDeposito = input.nextDouble();

                operacao.operacaoDepositar(valorDeposito);

            } else if (resposta == 4) {
                System.out.println("Operacao Finalizada!");
                break;

            } else {
                System.out.println("Erro, digite um numero valido!");
            }
        }
    }
}

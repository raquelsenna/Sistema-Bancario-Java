import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OperacaoBancaria operacao = new OperacaoBancaria();
        Scanner input = new Scanner(System.in);

        int answer;
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
            answer = input.nextInt();

            if(answer == 1) {
                operacao.getSaldo();

            } else if(answer == 2) {
                System.out.println("Saque: ");
                valorSaque = input.nextDouble();

                if(operacao.checkSaldo(valorSaque)) {
                    System.out.println("Valor de saque invalido!");
                } else {
                    operacao.setSaque(valorSaque);
                }

            } else if (answer == 3) {
                System.out.println("Deposito: ");
                valorDeposito = input.nextDouble();

                if (valorDeposito < 0) {
                    System.out.println("Deposito invalido!");
                } else {
                    operacao.setDeposito(valorDeposito);
                }


            } else if (answer == 4) {
                System.out.println("Operacao Finalizada!");
                break;

            } else {
                System.out.println("Erro, digite um numero valido!");
            }
        }
    }
}

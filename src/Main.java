import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 2500.50;
        double withdraw;
        double deposit;
        int answer;

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

            if (answer == 1) {
                System.out.println("Saldo: R$" + balance);

            } else if (answer == 2) {
                System.out.println("Saque: ");
                withdraw = input.nextDouble();

                if ((balance - withdraw) < 0) {
                    System.out.println("Saldo insuficiente");
                } else {
                    balance -= withdraw;
                }

            } else if (answer == 3) {
                System.out.println("Deposito: ");
                deposit = input.nextDouble();

                if (deposit < 0) {
                    System.out.println("Deposito invalido");
                } else {
                    balance += deposit;
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

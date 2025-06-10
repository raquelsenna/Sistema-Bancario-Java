public class OperacaoBancaria {
    double saldo = 2500.50;


    void getSaldo() {
        System.out.println("Saldo: " + saldo);
    }


    public boolean checkSaldo(double valor) {
        if (((saldo - valor) < 0) || valor < 0) {
            return true;
        }

        return false;
    }


    void saque(double valor) {
        saldo -= valor;
    }


    void deposito(double valor) {
        saldo += valor;
    }
}

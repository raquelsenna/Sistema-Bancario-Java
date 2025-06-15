public class OperacaoBancaria {
    private double saldo = 2500.50;
    private double saque;
    private double deposito;


    public void getSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }


    public void setSaque(double valor) {
        this.saque = valor;
        saque();
    }


    public void setDeposito(double valor) {
        this.deposito = valor;
        deposito();
    }


    public boolean checkSaldo(double valor) {
        if (((saldo - valor) < 0) || valor < 0) {
            return true;
        }

        return false;
    }


    private void saque() {
        this.saldo -= this.saque;
    }


    private void deposito() {
        this.saldo += this.deposito;
    }
}

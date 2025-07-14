package br.com.raquel.sistemabancario.model;

public class OperacaoBancaria {
    private double saldo;


    public double getSaldo() {
        return this.saldo;
    }


    public void operacaoSacar(double valor) {
        if (((getSaldo() - valor) >= 0) && valor > 0) {
            sacar(valor);
            System.out.println("Saque realizado com sucesso!\n");
        } else {
            System.out.println("Valor de saque invalido!\n");
        }
    }


    public void operacaoDepositar(double valor) {
        if (valor > 0) {
            depositar(valor);
            System.out.println("Deposito realizado com sucesso!\n");
        } else  {
            System.out.println("Valor de deposito invalido!\n");
        }
    }


    private void sacar(double valor) {
        this.saldo -= valor;
    }


    private void depositar(double valor) {
        this.saldo += valor;
    }
}

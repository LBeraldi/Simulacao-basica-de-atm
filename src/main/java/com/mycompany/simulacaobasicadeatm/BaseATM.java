
package com.mycompany.simulacaobasicadeatm;

public abstract class BaseATM implements ATM {
    
    private double saldo;
    
    public BaseATM(double saldoInicial) {
        this.saldo = saldoInicial;
    }
     
    
    @Override
    public double consultarSaldo() {
        return saldo;
    }
    
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de $" + valor + " efetuado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
// Depositar com sobrecarga
      public void depositar(double valor, String descricao) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de $" + valor + " efetuado com sucesso." + descricao);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }
    
    
    
    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de $" + valor + " efetuado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor de saque inválido.");
        }
    }
    
}

package com.mycompany.simulacaobasicadeatm;

public class SimulacaoBasicaDeATM {

    public static void main(String[] args) {

//   ContaCorrenteATM cc = new ContaCorrenteATM(1000.0);
//   
//        ContaPoupancaATM cp = new ContaPoupancaATM(500.0);
//
//            System.out.println("Saldo da Conta Corrente: $" + cc.consultarSaldo());
//            System.out.println("Saldo da Conta Poupança: $" + cp.consultarSaldo());
//
//        cc.depositar(1000.0);
//        cp.depositar(2000.0);
//
//            System.out.println("Saldo da Conta Corrente é de : $" + cc.consultarSaldo());
//            System.out.println("Saldo da Conta Poupança é de : $" + cp.consultarSaldo());
//
//        cc.sacar(150.0);
//        cp.sacar(230.0);
//
//            System.out.println("Saldo da Conta Corrente é de : $" + cc.consultarSaldo());
//            System.out.println("Saldo da Conta Poupança é de :$" + cp.consultarSaldo());
//   


        ContaCorrenteATM cc = new ContaCorrenteATM(1000.0);
        ContaPoupancaATM cp = new ContaPoupancaATM(500.0);

        System.out.println("Saldo da Conta Corrente: $" + cc.consultarSaldo());
        System.out.println("Saldo da Conta Poupança: $" + cp.consultarSaldo());

        cc.depositar(200.0, "Depósito mensal");
        cp.depositar(100.0, "Depósito inicial");

        System.out.println("Saldo da Conta Corrente após depósito: $" + cc.consultarSaldo());
        System.out.println("Saldo da Conta Poupança após depósito: $" + cp.consultarSaldo());
        
        cc.sacar(150.0);
        sSystem.out.println("Saldo da Conta Corrente é de : $" + cc.consultarSaldo());

   
    }
}

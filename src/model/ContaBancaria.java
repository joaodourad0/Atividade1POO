package model;

public class ContaBancaria {
	 private int numeroConta;
	    private String nome;
	    private double saldo;
	    
 public ContaBancaria(int numeroConta, String nome, double saldoInicial) {
	        this.numeroConta = numeroConta;
	        this.nome = nome;
	        this.saldo = saldoInicial;
	    }    
 public void realizarDeposito(double valor) {
     if (valor > 0) {
         saldo += valor;
         System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
     } else {
         System.out.println("Valor de depósito inválido.");
     }
 }
 
 public void realizarSaque(double valor) {
     if (valor > 0 && valor <= saldo) {
         saldo -= valor;
         System.out.println("Saque de R$" + valor + " realizado com sucesso.");
     } else {
         System.out.println("Saldo insuficiente para realizar o saque ou valor inválido.");
     }
 }
 
 public double getSaldo() {
     return saldo;
 }
}

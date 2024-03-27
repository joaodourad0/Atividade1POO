package model;

public class PrincipalContaBancaria {

	 public static void main(String[] args) {
	        // Criando uma conta bancária
	        ContaBancaria conta = new ContaBancaria(1, "João", 2000.0);

	        // Realizando operações de depósito e saque
	        conta.realizarDeposito(2000);
	        conta.realizarSaque(1000);

	        // Exibindo o saldo atual da conta
	        System.out.println("Saldo atual: R$" + conta.getSaldo());
	    }
	}
	


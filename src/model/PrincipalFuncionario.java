package model;

public class PrincipalFuncionario {

	public static void main(String[] args) {
      
        Funcionario f1 = new Funcionario("João", 5200.0, "Analista");

     
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Salário: R$" + f1.getSalario());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Salário líquido: R$" + f1.getSalarioLiquido());
        
        System.out.println("******************************");
        
        Funcionario f2 = new Funcionario("Maria", 1000.0, "Estagiário");

        
        System.out.println("Nome: " + f2.getNome());
        System.out.println("Salário: R$" + f2.getSalario());
        System.out.println("Cargo: " + f2.getCargo());
        System.out.println("Salário líquido: R$" + f2.getSalarioLiquido());
    }
}

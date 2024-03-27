package model;

import java.time.LocalDate;

public class PrincipalPessoa{ 

public static void main(String[] args) {
  
    Pessoa pessoa = new Pessoa("João", LocalDate.of(1998, 1, 31), "Estudante");

    
    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
    System.out.println("Profissão: " + pessoa.getProfissao());
    System.out.println("Idade: " + pessoa.getIdade() + " anos");
}
}

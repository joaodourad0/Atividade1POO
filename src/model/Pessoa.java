package model;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    
    private String nome;
    private LocalDate dataNascimento;
    private String profissao;

    
    public Pessoa(String nome, LocalDate dataNascimento, String profissao) {
        this.nome = nome;
        setDataNascimento(dataNascimento);
        this.profissao = profissao;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
          if (Period.between(dataNascimento, LocalDate.now()).getYears() <= 150) {
            this.dataNascimento = dataNascimento;
        } else {
            System.out.println("Idade inválida. A pessoa não pode ter mais de 150 anos.");
        }
    }

  
    public void setDataNascimento(int dia, int mes, int ano) {
        setDataNascimento(LocalDate.of(ano, mes, dia));
    }

   
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

 
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
}

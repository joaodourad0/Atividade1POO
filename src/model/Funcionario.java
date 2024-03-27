package model;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;
    private double salarioMinimo = 1412.00;

    
    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        setSalario(salario);
        this.cargo = cargo;
    }

    public double calcularSalarioLiquido(double beneficios) {
    	double descontoImposto = salario * 0.11;
        double descontoTransporte = salario * 0.06; 
        double descontoAlimentacao = salario * 0.05; 
        double salarioLiquido = salario - descontoImposto - descontoTransporte - descontoAlimentacao + beneficios;
        return  salarioLiquido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        double descontoImposto = salario * 0.11;
        this.salario = Math.max(salarioMinimo, salario - descontoImposto);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioLiquido() {
        return calcularSalarioLiquido( 0);
    }
}
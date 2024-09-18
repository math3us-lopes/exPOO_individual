package br.com.aulapoo.ZexercicioExtra;

public class Funcionario {
    private String nome;
    private double salario;

    // Construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // Getters e setters
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
        this.salario = salario;
    }

    // Método para calcular INSS (11% do salário)
    public double calcularInss() {
        return salario * 0.11;
    }

    // Método para calcular Vale Transporte (6% do salário)
    public double calcularValeTransporte() {
        return salario * 0.06;
    }

    // Método para calcular o salário líquido (salário - INSS - Vale Transporte)
    public double calcularSalarioLiquido() {
        return salario - calcularInss() - calcularValeTransporte();
    }
}

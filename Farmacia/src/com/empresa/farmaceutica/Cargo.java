package com.empresa.farmaceutica;

public class Cargo {
    private String nome;
    private double salarioBase;
    private Beneficios beneficio;

    public Cargo(String nome, double salarioBase, Beneficios beneficio) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.beneficio = beneficio;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public Beneficios getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(Beneficios beneficio) {
        this.beneficio = beneficio;
    }
    
}

package com.empresa.farmaceutica;

import java.util.ArrayList;

public class Setor {
    private String nome;
    private int qtdMaximaFuncionarios;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Cargo> cargos;
    
    public Setor(String nome, int qtdMaximaFuncionarios, ArrayList<Cargo> cargos) {
        this.nome = nome;
        this.qtdMaximaFuncionarios = qtdMaximaFuncionarios;
        this.funcionarios = new ArrayList<>();
        this.cargos = cargos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdMaximaFuncionarios() {
        return qtdMaximaFuncionarios;
    }

    public void setQtdMaximaFuncionarios(int qtdMaximaFuncionarios) {
        this.qtdMaximaFuncionarios = qtdMaximaFuncionarios;
    }

    //Retorna a lista de funcionarios que pertencem ao setor
    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    //Adiciona funcionario na lista que representa os integrantes do setor
    public void addFuncionarios(Funcionario funcionario) {
        
        if(this.funcionarios.size()>=getQtdMaximaFuncionarios()){
            this.funcionarios.add(funcionario);
        }else{
            System.out.println("Não é possível adicionar funcionário no setor.");
            System.out.println("Quantidade maxima de integrantes no setor atingida.");

            //Exceção a ser lançada caso a quantidade de integrantes no setor seja atingida
            /* 
            throw new com.empresa.farmaceutica.CapacidadeMaximaSetorException(
                "Não é possível adicionar funcionário no setor, pois a quantidade máxima de integrantes no setor foi atingida."
            );
            */
        }
        
    }

    public ArrayList<Cargo> getCargos() {
        return cargos;
    }


    public void setCargos(ArrayList<Cargo> cargos) {
        this.cargos = cargos;
    }

    @Override
    public String toString() {
        return String.format("Setor: %s, Cargo: %s (%d/%d funcionários)",
                nome, getCargos(), getQtdMaximaFuncionarios(), qtdMaximaFuncionarios);
    }

    

    
}

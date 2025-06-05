package com.empresa.farmaceutica;

public class Funcionario {
    private static int contador = 0;

    private int id;
    private String nome;
    private int idade;
    private Genero genero;
    private Setor setor;
    private Cargo cargo;
    private double bonificacoesLucros;
    

    public Funcionario(int id, String nome, int idade, Genero genero, Setor setor, Cargo cargo) {

        //Somente atribuirá o cargo ao funcionário, caso o cargo informado exista no array de cargos existentes no setor
        for(Cargo c : getSetor().getCargos()){
            if(cargo.getNome().toLowerCase().equals(c)){
                this.cargo = cargo;
            }else{
                System.out.println("O cargo digitado não é relativo ao setor "+setor.getNome());
                //Implementar exception posteriormente
                return;
            }
        }

        //Atribui um id unico ao funcionario, com base no contador estatico
        this.id = ++contador;
        
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.setor = setor;
        this.bonificacoesLucros = 0;
    }

    public static int getContador() {
        return contador;
    }
    
    public int getIdFuncionario() {
        return id;
    }
   
    public String getNomeFuncionario() {
        return nome;
    }
    public void setNomeFuncionario(String nome) {
        this.nome = nome;
    }
    public int getIdadeFuncionario() {
        return idade;
    }
    public void setIdadeFuncionario(int idade) {
        this.idade = idade;
    }

    public Genero getGeneroFuncionario() {
        return genero;
    }

    public void setGeneroFuncionario(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getBonificacoesLucros() {
        return bonificacoesLucros;
    }

    public void setBonificacoesLucros(double bonificacoesLucros) {
        this.bonificacoesLucros = bonificacoesLucros;
    }
    
    //Retorna o salário liquido após a dedução do imposto
    public double calcularSalario(){
        return CalculadoraIR.Calcular(getCargo().getSalarioBase());
    }

    public void renderInformacoes(){
        System.out.println("ID DO FUNCIONARIO: " + this.id);
        System.out.println("NOME DO FUNCIONARIO: " + this.nome);
        System.out.println("CARGO DO FUNCIONARIO: " + this.cargo);
        System.out.println("SALARIO BRUTO DO CARGO: "+ this.cargo.getSalarioBase());

        //VERIFICAR CALCULO DA PL
        System.out.println("SALARIO LIQUIDO (DEDUZIDO O IMPOSTO DE RENDA: " + calcularSalario());
        System.out.println("VALOR DOS BENEFICIOS: ");
        System.out.println("VALE REFEICAO: " + this.cargo.getBeneficio().getValeRefeicao());
        System.out.println("VALE ALIMENTACAO: "+this.cargo.getBeneficio().getValeAlimentacao());
        System.out.println("VALE TRANSPORTE: "+ this.cargo.getBeneficio().getValeTransporte());
        System.out.println("PLANO ODONTOLOGICO: "+ this.cargo.getBeneficio().getPlanoOdontologico());
        System.out.println("VALE PLANO DE SAUDE: "+ this.cargo.getBeneficio().getPlanoSaude());
    }
}

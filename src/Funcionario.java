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
    
    public int getId() {
        return id;
    }
   
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
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
        return calcular(getCargo().getSalarioBase());
    }
    

}

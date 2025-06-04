public class Cargo {
    private String nome;
    private double salarioBase;
    private Beneficio beneficio;

    
    
    public Cargo(String nome, double salarioBase, Beneficio beneficio) {
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
    
    public Beneficio getBeneficio() {
        return beneficio;
    }
    public void setBeneficio(Beneficio beneficio) {
        this.beneficio = beneficio;
    }
    
}

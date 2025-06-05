public class Beneficios {
    private double valeRefeicao;
    private double valeAlimentacao;
    private double planoSaude;
    private double planoOdontologico;
    private double valeTransporte;

    public Beneficios(double valeRefeicao, double valeAlimentacao, double planoSaude, double planoOdontologico, double valeTransporte) {
        this.valeRefeicao = valeRefeicao;
        this.valeAlimentacao = valeAlimentacao;
        this.planoSaude = planoSaude;
        this.planoOdontologico = planoOdontologico;
        this.valeTransporte = valeTransporte;
    }

    public double getValeRefeicao() {
        return valeRefeicao;
    }

    public void setValeRefeicao(double valeRefeicao) {
        this.valeRefeicao = valeRefeicao;
    }

    public double getValeAlimentacao() {
        return valeAlimentacao;
    }

    public void setValeAlimentacao(double valeAlimentacao) {
        this.valeAlimentacao = valeAlimentacao;
    }

    public double getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(double planoSaude) {
        this.planoSaude = planoSaude;
    }

    public double getPlanoOdontologico() {
        return planoOdontologico;
    }

    public void setPlanoOdontologico(double planoOdontologico) {
        this.planoOdontologico = planoOdontologico;
    }

    public double getValeTransporte() {
        return valeTransporte;
    }

    public void setValeTransporte(double valeTransporte) {
        this.valeTransporte = valeTransporte;
    }

    @Override
    public String toString() {
        return String.format("VR: R$%.2f, VA: R$%.2f, Saúde: R$%.2f, Odonto: R$%.2f, VT: R$%.2f",
                valeRefeicao, valeAlimentacao, planoSaude, planoOdontologico, valeTransporte);
    }
}
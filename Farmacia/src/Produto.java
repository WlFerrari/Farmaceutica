public class Produto {
    private int idProduto;
    private String nomeProduto;
    private double precoCompra;
    private double precoVenda;

    public Produto(int idProduto, String nomeProduto, double precoCompra, double precoVenda){
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }
}

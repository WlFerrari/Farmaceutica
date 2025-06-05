package com.empresa.farmaceutica;

public class ItemNegocio {
    private Produto produto;
    private int quantidade;

    public ItemNegocio(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;

    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "com.empresa.farmaceutica.Produto: " + this.produto.toString() + ", Quantidade: " + this.quantidade;
    }
}

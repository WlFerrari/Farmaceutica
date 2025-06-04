package com.empresa.farmaceutica;

// Classe temporaria para teste
public class Produto {
    private int idProduto;
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private int estoque;

    public Produto(int idProduto, String nome, double precoCompra, double precoVenda, int estoque) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.estoque = estoque;


    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "ID: " + this.idProduto + ", Nome: " + this.nome + ", Preço Compra: " + this.precoCompra + ", Preço Venda: " + this.precoVenda + ", Estoque: " + this.estoque;
    }
}

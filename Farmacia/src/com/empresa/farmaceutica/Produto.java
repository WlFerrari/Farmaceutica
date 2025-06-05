package com.empresa.farmaceutica;

public class Produto {
    private static int proximoIdProduto = 1;
    private int idProduto;
    private String nome;
    private double precoCompra;
    private double precoVenda;
    private int estoque;

    public Produto(String nome, double precoCompra, double precoVenda, int estoque) {
        this.idProduto = proximoIdProduto++;
        this.nome = nome;
        this.precoCompra = precoCompra;
        this.precoVenda = precoVenda;
        this.estoque = estoque;
    }

    // Getters e Setters

    public int getIdProduto() { return idProduto; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPrecoCompra() { return precoCompra; }
    public void setPrecoCompra(double precoCompra) { this.precoCompra = precoCompra; }
    public double getPrecoVenda() { return precoVenda; }
    public void setPrecoVenda(double precoVenda) { this.precoVenda = precoVenda; }
    public int getEstoque() { return estoque; }
    public void setEstoque(int estoque) { this.estoque = estoque; }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) this.estoque += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade > 0 && this.estoque >= quantidade) {
            this.estoque -= quantidade;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("ID: %d, Produto: %s, Compra: R$%.2f, Venda: R$%.2f, Estoque: %d unidades",
                idProduto, nome, precoCompra, precoVenda, estoque);
    }
}
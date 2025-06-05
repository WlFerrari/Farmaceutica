package com.empresa.farmaceutica;

import java.util.List;
import java.util.UUID;

//id utilizando uuid
public class Negocio {
    private UUID id;
    private TipoNegocio tipo;
    private List<ItemNegocio> itens;
    private List<Funcionario> funcionariosEnvolvidos;
    private StatusNegocio status;
    private double valorTotalNegocio;

    public Negocio(UUID id, TipoNegocio tipo, List<ItemNegocio> itens, List<Funcionario> funcionariosEnvolvidos, StatusNegocio status, double valorTotalNegocio) {
        this.id = id;
        this.tipo = tipo;
        this.itens = itens;
        this.funcionariosEnvolvidos = funcionariosEnvolvidos;
        this.status = status;
        this.valorTotalNegocio = valorTotalNegocio;
    }

    private void calcularValorTotal() {
        this.valorTotalNegocio = 0;
        for (ItemNegocio item : itens) {
            if (tipo == TipoNegocio.VENDA) {
                this.valorTotalNegocio += item.getProduto().getPrecoVenda() * item.getQuantidade();
            } else { // COMPRA
                this.valorTotalNegocio += item.getProduto().getPrecoCompra() * item.getQuantidade();
            }
        }
    }


    public UUID getIdNegocio() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public TipoNegocio getTipo() {
        return tipo;
    }

    public void setTipo(TipoNegocio tipo) {
        this.tipo = tipo;
    }

    public List<ItemNegocio> getItens() {
        return itens;
    }

    public void setItens(List<ItemNegocio> itens) {
        this.itens = itens;
    }

    public List<Funcionario> getFuncionariosEnvolvidos() {
        return funcionariosEnvolvidos;
    }

    public void setFuncionariosEnvolvidos(List<Funcionario> funcionariosEnvolvidos) {
        this.funcionariosEnvolvidos = funcionariosEnvolvidos;
    }

    public StatusNegocio getStatus() {
        return status;
    }

    public void setStatus(StatusNegocio status) {
        this.status = status;
    }

    public double getValorTotalNegocio() {
        return valorTotalNegocio;
    }

    public void setValorTotalNegocio(double valorTotalNegocio) {
        this.valorTotalNegocio = valorTotalNegocio;
    }
}

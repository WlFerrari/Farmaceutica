package com.empresa.farmaceutica;

import java.util.ArrayList;
import java.util.List;

public class Transportadora {
    private String nome;
    private List<String> locaisAtendimento;

    public Transportadora(String nome, List<String> locaisAtendimento) {
        this.nome = nome;
        this.locaisAtendimento = new ArrayList<>(locaisAtendimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getLocaisAtendimento() {
        return locaisAtendimento;
    }

    public void setLocaisAtendimento(List<String> locaisAtendimento) {
        this.locaisAtendimento = locaisAtendimento;
    }

    @Override
    public String toString() {
        return String.format("com.empresa.farmaceutica.Transportadora: %s, Atende: %s", nome, String.join(", ", locaisAtendimento));
    }
}

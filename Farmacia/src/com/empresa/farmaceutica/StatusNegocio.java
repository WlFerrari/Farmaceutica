package com.empresa.farmaceutica;

public enum StatusNegocio {
    ABERTO,
    CONCLUIDO,
    CANCELADO;

    public static void listarOpcoes() {
        for (int i = 0; i < values().length; i++) {
            System.out.println(i + " - " + values()[i]);
        }
    }

    public static StatusNegocio obterPorIndice(int indice) {
        return values()[indice];
    }
}

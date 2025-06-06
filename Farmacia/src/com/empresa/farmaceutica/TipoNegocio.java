package com.empresa.farmaceutica;

public enum TipoNegocio {
    VENDA,
    COMPRA;

    public static void listarOpcoes() {
        for (int i = 0; i < values().length; i++) {
            System.out.println(i + " - " + values()[i]);
        }
    }

    public static TipoNegocio obterPorIndice(int indice) {
        return values()[indice];
    }
}
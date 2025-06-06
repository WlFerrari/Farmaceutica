package com.empresa.farmaceutica;

public enum Genero {
    MASCULINO,
    FEMININO,
    OUTRO,
    NAO_INFORMAR;

    public static void listarOpcoes() {
        for (int i = 0; i < values().length; i++) {
            System.out.println(i + " - " + values()[i]);
        }
    }

    public static Genero obterPorIndice(int indice) {
        return values()[indice];
    }
}

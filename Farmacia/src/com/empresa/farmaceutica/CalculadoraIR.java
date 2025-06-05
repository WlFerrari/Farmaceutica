package com.empresa.farmaceutica;

public class CalculadoraIR {

    // Convenção Java: nomes de métodos começam com minúscula.
    public static double Calcular(double baseCalculo) {
        if (baseCalculo <= 0) return 0.0; // Imposto é 0 para base negativa ou zero

        if (baseCalculo <= 2428.80) {
            return 0.0; // Isento - valor do imposto é zero
        } else if (baseCalculo <= 2826.65) { // De R$ 2.428,81 até R$ 2.826,65
            return (baseCalculo * 0.075) - 182.16;
        } else if (baseCalculo <= 3751.05) { // De R$ 2.826,66 até R$ 3.751,05
            return (baseCalculo * 0.15) - 394.16;
        } else if (baseCalculo <= 4664.68) { // De R$ 3.751,06 até R$ 4.664,68
            return (baseCalculo * 0.225) - 675.49;
        } else { // Acima de R$ 4.664,68
            return (baseCalculo * 0.275) - 908.75;
        }
    }
}
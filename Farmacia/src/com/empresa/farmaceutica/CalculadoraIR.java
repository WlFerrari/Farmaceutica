package com.empresa.farmaceutica;

public class CalculadoraIR {

    public static double Calcular(double baseCalculo){
        if(baseCalculo <= 2428.80){
            return baseCalculo;
        } else if(baseCalculo >= 2428.81 && baseCalculo <= 2826.65){
            return baseCalculo * (1 - 0.075);
        } else if(baseCalculo >= 2826.66 && baseCalculo <= 3751.05){
            return baseCalculo * (1 - 0.15);
        } else if(baseCalculo >= 3751.06 && baseCalculo <= 4664.68){
            return baseCalculo * (1 - 0.225);
        } else {
            return baseCalculo * (1 - 0.275);
        }
    }
}
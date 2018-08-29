package com.mycompany.atividade06;

import java.util.Arrays;

public class Calculadora {
    
    public double calculaMediana(double vetor[]){
        Arrays.sort(vetor);
        double mediana;
        int tamanho = vetor.length;
        if(tamanho % 2 == 1){
            mediana = vetor[tamanho / 2];
        } else {
            int valor1 = (vetor.length / 2) - 1;
            int valor2 = (vetor.length / 2);
            mediana = (vetor[valor1]+vetor[valor2]) / 2;
        }
        return mediana;
    }
}
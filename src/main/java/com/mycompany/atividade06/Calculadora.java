package com.mycompany.atividade06;

import java.util.Arrays;

public class Calculadora {
    
    public double calculaMediana(double[] vetor){
        ordenaVetor(vetor);
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
    
    public double calculaMedia(double[] vetor){
        ordenaVetor(vetor);
        double media = 0.0;
        for (double valor : vetor){
            media += valor;
        }
        media /= vetor.length;
        return media;
    }

    public double getMenorValor(double[] vetor) {
        ordenaVetor(vetor);
        return vetor[0];
    }
    public double getMaiorValor(double[] vetor) {
        ordenaVetor(vetor);
        return vetor[vetor.length - 1];
    }

    public int getValoresAbaixo(double[] vetor, double media) {
        ordenaVetor(vetor);
        int count = 0;
        for(double valor : vetor){
            if (valor < media)
                count++;
        }
        return count;
    }

    public int getValoresAcima(double[] vetor, double media) {
        ordenaVetor(vetor);
        int count = 0;
        for(double valor : vetor){
            if (valor > media)
                count++;
        }
        return count;
    }
    
    private double[] ordenaVetor(double[] vetor){
        Arrays.sort(vetor);
        return vetor;
    }
}
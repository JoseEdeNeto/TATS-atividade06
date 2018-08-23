package com.mycompany.atividade06;

public class Calculadora {
    
    public double calculaMediana(double vetor[]){
        double mediana;
        int tamanho = vetor.length;
        mediana = vetor[tamanho/2];
        
        return mediana;
    }
}
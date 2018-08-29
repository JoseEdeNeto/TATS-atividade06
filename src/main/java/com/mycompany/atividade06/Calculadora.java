package com.mycompany.atividade06;

import java.util.Arrays;

public class Calculadora {
    
    public double calculaMediana(double[] vetor) throws Exception{
        vetorVazio(vetor);
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
    
    public double calculaMedia(double[] vetor) throws Exception{
        vetorVazio(vetor);
        ordenaVetor(vetor);
        double media = 0.0;
        for (double valor : vetor){
            media += valor;
        }
        media /= vetor.length;
        return media;
    }

    public double getMenorValor(double[] vetor) throws Exception {
        vetorVazio(vetor);
        ordenaVetor(vetor);
        return vetor[0];
    }
    public double getMaiorValor(double[] vetor) throws Exception {
        vetorVazio(vetor);
        ordenaVetor(vetor);
        return vetor[vetor.length - 1];
    }

    public int getValoresAbaixo(double[] vetor, double media) throws Exception {
        vetorVazio(vetor);
        ordenaVetor(vetor);
        int count = 0;
        for(double valor : vetor){
            if (valor < media)
                count++;
        }
        return count;
    }

    public int getValoresAcima(double[] vetor, double media) throws Exception {
        vetorVazio(vetor);
        ordenaVetor(vetor);
        int count = 0;
        for(double valor : vetor){
            if (valor > media)
                count++;
        }
        return count;
    }
    
    public double calculaDesvioPadrao(double[] vetor) throws Exception {
        vetorVazio(vetor);
        double sum = 0;
        double media = calculaMedia(vetor);
        for(double valor : vetor){
            double aux = valor - media;
            sum += aux * aux;
        }
        return Math.sqrt(((double) 1 / (vetor.length - 1)) * sum);
    }
    
    public double[] menoresMaiores(double[] vetor, int n) throws Exception{
        vetorVazio(vetor);
        if(n <= 0)
            throw new Exception();
        ordenaVetor(vetor);
        double[] maiores = new double[n], 
                menores = new double[n];
        int i = 0,
            j = vetor.length - 1;
        while(i < n){
            menores[i] = vetor[i];
            maiores[i] = vetor[j];
            i++;
            j--;
        }
        ordenaVetor(maiores);
        double[] resultado = new double[n * 2];
        System.arraycopy(menores, 0, resultado, 0, n);
        for(int count = menores.length; count < n * 2; count++){
            resultado[count] = maiores[count-menores.length];
        }
        return resultado;
    }
    
    private double[] ordenaVetor(double[] vetor){
        Arrays.sort(vetor);
        return vetor;
    }
    
    private void vetorVazio(double[] vetor) throws Exception{
        if(vetor.length == 0){
            throw new Exception();
        }
    }
    
}
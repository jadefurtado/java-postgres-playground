package com.example;

import java.util.Arrays;

public class AppArrays {
    
    public static void main(String[] args) {
        
        // com tipos primitivos, podemos passar um inteiro para um double, pois o conjunto dos inteiros está contido no conjunto dos reais
        int i = 10;
        double d  = i;
        System.out.println(d);

        // no caso do array, só podemos passar os valores para outro array do MESMO TIPO, apesar do int estar contido em double
        double vetorDouble1[] = {10, 20, 30};
        double vetorDouble2[] = vetorDouble1;

        // para imprimir os valores de um array, temos que usar o método Arrays.toString
        System.out.println(Arrays.toString(vetorDouble2));

        System.out.println("valor da posição 0 = " + vetorDouble1[0]);
        System.out.println("valor da posição 0 = " + vetorDouble1[1]);
        System.out.println("valor da posição 0 = " + vetorDouble1[2]);

        // modificando um valor do array através da sua posição
        vetorDouble1[0] = 1;
        System.out.println("Valor da posição 0: " + vetorDouble1[0]);

        // criando vetor sem atribuir valores (necessário informar o tamanho)
        int vetor3[] = new int[4];
        // populando valores
        vetor3[0] = 100;
        vetor3[1] = 200;
        vetor3[2] = 300;
        vetor3[3] = 400;
        System.out.println(Arrays.toString(vetor3));

        // criando uma matriz
        double matriz[][] = { {10, 20, 30}, {40, 50, 60} };

        // a matriz é um conjunto de vetores, logo não podemos imprimir direto
        // a melhor maneira é imprimir as linhas individualmente
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        // alterando um valor numa matriz
        matriz[0][1] = -20;

        // alterando uma linha inteira 
        // como a primeira linha de uma matriz é um vetor, precisamos CRIAR um vetor para alterar o valor dela
        matriz[0] = new double[]{1, 2}; // as matrizes não precisam ter o mesmo número de elementos nas linhas

        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));




        
    }
}

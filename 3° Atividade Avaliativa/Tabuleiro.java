package com.mycompany.monopolio;

// Mateus
public class Tabuleiro {
    int numeroCasas = 40;
    int inicio = 0;
    int fim = numeroCasas -1;
    
    Propriedade[] propriedades = new Propriedade[numeroCasas];
    
    public Tabuleiro(Propriedade[] propriedades) {
        this.propriedades = propriedades;
    }
    
    public Propriedade getPropriedade(int posicao){
        if (posicao >= 0 && posicao < numeroCasas){
            return propriedades[posicao];
        }
        return null;
    }
    
    public int getCasaSeguinte(int posicao) {
        if (posicao == fim){
            return inicio;
        }
        return posicao + 1;
    }
}
    
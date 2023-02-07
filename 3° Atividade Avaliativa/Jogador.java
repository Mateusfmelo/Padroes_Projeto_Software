package com.mycompany.monopolio;

public class Jogador {
    String nome;
    int saldo;
    String cor;
    int posicao;

    public Jogador(String nome, int saldo, String cor, int posicao) {
        this.nome = nome;
        this.saldo = saldo;
        this.cor = cor;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public int getSaldo() {
        return saldo;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }
    
    public void fazerPagamento(int valor){
        saldo -= valor;
    }
    
    public void ganharDinheiro(int valor){
        saldo += valor;
    }
}

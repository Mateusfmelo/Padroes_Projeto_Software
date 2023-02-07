package com.mycompany.monopolio;

// Mateus

public class Propriedade {
    String nome;
    int preco;
    int aluguel;
    String posicao;

    public Propriedade(String nome, int preco, int aluguel, String posicao) {
        this.nome = nome;
        this.preco = preco;
        this.aluguel = aluguel;
        this.posicao = posicao;
    }

    public Propriedade(String nome, String posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public int getAluguel() {
        return aluguel;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }
}

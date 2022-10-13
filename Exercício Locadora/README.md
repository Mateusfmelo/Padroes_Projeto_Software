<h1 align="center">Explicação do Exercício</h1>

<h3 align="center">A atividade consiste em refatorar o código abaixo aplicando padrões de responsabilidade Expert, Creator, Baixo acoplamento e Alta coesão.<h3>  

```  
public class Locadora {
    
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Juliana");
        c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista ",
                Fita.NORMAL), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Men in Black ",
                Fita.NORMAL), 2));
        c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III ",
                Fita.LANÇAMENTO), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos ",
                Fita.LANÇAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ",
                Fita.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao ",
                Fita.INFANTIL), 30));
        System.out.println(c1.extrato());
    }
}
```
```
public class Fita {

    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    
    private String título;
    private int códigoDePreço;

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }

    public String getTítulo() {
        return título;
    }

    public int getCódigoDePreço() {
        return códigoDePreço;
    }

    public void setCódigoDePreço(int códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }
}
```
```
public class Aluguel {

    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
}
```
```
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Cliente {

    private String nome;
    private Collection fitasAlugadas = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {

        final String fimDeLinha = System.getProperty("line.separator");
        
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;

        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        
        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel) alugueis.next();

            // determina valores para cada linha
            switch (cada.getFita().getCódigoDePreço()) {
                case Fita.NORMAL:
                    valorCorrente += 2;
                    if (cada.getDiasAlugada() > 2) {
                        valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                    }
                    break;

                case Fita.LANÇAMENTO:
                    valorCorrente += cada.getDiasAlugada() * 3;
                    break;

                case Fita.INFANTIL:
                    valorCorrente += 1.5;
                    if (cada.getDiasAlugada() > 3) {
                        valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            } // switch

            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;

            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (cada.getFita().getCódigoDePreço() == Fita.LANÇAMENTO &&
                    cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }

            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente +
                    fimDeLinha;
            valorTotal += valorCorrente;
        } // while

        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
}
```

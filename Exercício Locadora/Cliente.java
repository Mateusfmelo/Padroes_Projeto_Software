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
        String resultado = "\nRegistro de Aluguel(is) de: " + getNome() + fimDeLinha;
        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel) alugueis.next();
            // determina valores para cada linha
            valorCorrente += cada.getValorDoAluguel();            
         
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente += cada.getPontosDeAlugadorFrequente();

            // mostra valores para este aluguel
            resultado += "" + cada.getTitulo() + ": " + valorCorrente
                    + fimDeLinha;
            valorTotal += valorCorrente;
        } // while

        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou: " + pontosDeAlugadorFrequente
                + " pontos de alugador frequente\n";
        return resultado;
    }
}

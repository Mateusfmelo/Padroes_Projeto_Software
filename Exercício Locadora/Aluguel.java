import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Aluguel {

    private Fita fita;
    private int diasAlugada;
    private Collection fitasAlugadas = new ArrayList();
    

    public Aluguel(Fita fita, int diasAlugada, Collection fitasAlugadas) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
        this.fitasAlugadas = fitasAlugadas;
    }

    public Fita getFita() {
        return fita;
    }

    public void setFita(Fita fita) {
        this.fita = fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public void setDiasAlugada(int diasAlugada) {
        this.diasAlugada = diasAlugada;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {

        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
        
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

    @Override
    public String toString() {
        return "Aluguel [fita=" + fita + ", diasAlugada=" + diasAlugada + "]";
    }
}

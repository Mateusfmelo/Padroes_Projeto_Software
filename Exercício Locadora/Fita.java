public class Fita implements Fretagem {

    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    private String titulo;
    private Catalogo classificacao;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        setCodigoDePreco(codigoDePreco);
    }

    public void setCodigoDePreco(int codigoDePreco) {
        switch (codigoDePreco) {
            case NORMAL:
                classificacao = new FitaNormal();
                break;
            case LANÇAMENTO:
                classificacao = new FitaLancamento();
                break;
            case INFANTIL:
                classificacao = new FitaInfantil();
                break;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Catalogo getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Catalogo classificacao) {
        this.classificacao = classificacao;
    }

    public double getValorDoAluguel(int diasAlugado) {
        return classificacao.getValorDoAluguel(diasAlugado);
    }

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}

public class Fita implements Fretagem {

    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    private String titulo;
    private Classificacao classificacao;

    public Fita(String titulo, int codigoDePreco) {
        this.titulo = titulo;
        setCodigoDePreco(codigoDePreco);
    }

    public void setCodigoDePreco(int codigoDePreco) {
        switch (codigoDePreco) {
            case NORMAL:
                classificacao = new ClassificacaoNormal();
                break;
            case LANÇAMENTO:
                classificacao = new ClassificacaoLancamento();
                break;
            case INFANTIL:
                classificacao = new ClassificacaoInfantil();
                break;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    public double getValorDoAluguel(int diasAlugado) {
        return classificacao.getValorDoAluguel(diasAlugado);
    }

    public int getPontosDeAlugadorFrequente(int diasAlugado) {
        return classificacao.getPontosDeAlugadorFrequente(diasAlugado);
    }
}

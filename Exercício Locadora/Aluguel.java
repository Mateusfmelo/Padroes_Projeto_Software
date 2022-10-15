public class Aluguel {

    private Fretagem item;
    private int diasAlugado;

    public Aluguel(Fretagem item, int diasAlugado) {
        this.item = item;
        this.diasAlugado = diasAlugado;
    }

    public String getTitulo(){
        return item.getTitulo();
    }

    public Fretagem getItem() {
        return item;
    }

    public void setItem(Fretagem item) {
        this.item = item;
    }

    public int getDiasAlugado() {
        return diasAlugado;
    }

    public void setDiasAlugado(int diasAlugado) {
        this.diasAlugado = diasAlugado;
    }

    public int getPontosDeAlugadorFrequente() {
        return item.getPontosDeAlugadorFrequente(diasAlugado);
    }

    public double getValorDoAluguel() {
        return item.getValorDoAluguel(diasAlugado);
    }
}

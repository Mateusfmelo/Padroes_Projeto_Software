public class JogoDaVelha  {
    Tabuleiro tabuleiro;

    public JogoDaVelha() {
        this.tabuleiro = new Tabuleiro();         
    }
    
    public void jogar(){
        tabuleiro.executar();
    }
}

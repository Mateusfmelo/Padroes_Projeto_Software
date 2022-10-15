public class ClassificacaoLancamento extends Classificacao {

    public double getValorDoAluguel(int diasAlugado) {
         return diasAlugado * 3;
     }
 
     public int getPontosDeAlugadorFrequente(int diasAlugados) {
         return (diasAlugados > 1) ? 2 : 1;
     }
}

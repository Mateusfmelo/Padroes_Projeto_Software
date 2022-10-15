public class FitaLancamento extends Catalogo {

    public double getValorDoAluguel(int diasAlugado) {
         return diasAlugado * 3;
     }
 
     public int getPontosDeAlugadorFrequente(int diasAlugados) {
         return (diasAlugados > 1) ? 2 : 1;
     }
}

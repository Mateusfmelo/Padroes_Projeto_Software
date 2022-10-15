public class ClassificacaoNormal extends Classificacao {

    public double getValorDoAluguel(int diasAlugado) {
         double valorDoAluguel = 2;
         if (diasAlugado > 2) {
             valorDoAluguel += (diasAlugado - 2) * 1.5;
         }
         return valorDoAluguel;
     }
}

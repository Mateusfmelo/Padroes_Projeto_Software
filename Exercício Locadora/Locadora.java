public class Locadora {

        public static void main(String[] args) {

            Cliente c1 = new Cliente("Barros");
            Cliente c2 = new Cliente("Otacilio");

            c1.adicionaAluguel(new Aluguel(new Fita("A vida de um programador milionário", Fita.NORMAL), 30));
            c2.adicionaAluguel(new Aluguel(new Fita("Meu malvado favorito", Fita.INFANTIL), 13));
            c2.adicionaAluguel(new Aluguel(new Fita("Alunos em pânico", Fita.LANÇAMENTO), 365));

            System.out.println(c1.extrato());
            System.out.println(c2.extrato());
        }
    }

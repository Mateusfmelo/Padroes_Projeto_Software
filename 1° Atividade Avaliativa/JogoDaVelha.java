import java.util.Scanner;

public class JogoDaVelha {
    private int jogoDaVelha [][];
    private int jogador1;
    private int jogador2;

    public JogoDaVelha() {
        this.jogoDaVelha = new int[3][3];
        this.jogador1 = 1;
        this.jogador2 = 0;
    }

    public int[][] getJogoDaVelha() {
        return jogoDaVelha;
    }

    public void setJogoDaVelha(int[][] jogoDaVelha) {
        this.jogoDaVelha = jogoDaVelha;
    }

    public int getJogador1() {
        return jogador1;
    }


    public int getJogador2() {
        return jogador2;
    }

    public int [][] movimentoJogador1 (int i, int j) {
        if (jogoDaVelha [i][j] != 3) {
            System.out.print("Esta casa já foi preenchida!");
            return jogoDaVelha;
        }
        jogoDaVelha [i][j] = getJogador1();
        return jogoDaVelha;
    }
    public int [][] movimentoJogador2 (int i, int j) {
        if (jogoDaVelha [i][j] != 3) {
            System.out.print("Esta casa já foi preenchida!");
            return jogoDaVelha;
        }
        jogoDaVelha [i][j] = getJogador2();
        return jogoDaVelha;
    }
    public void iniciarJogo () {
        for (int i = 0; i < jogoDaVelha.length; i++)
            for (int j = 0; j < jogoDaVelha[0].length; j++) {
                jogoDaVelha [i][j] = 3;
            }
    }
    public boolean jogoTerminado (int x [][]) {
        for (int i = 0; i < jogoDaVelha.length; i++)
            for (int j = 0; j < jogoDaVelha[0].length; j++) {
                if (x [i][j] == 3) {
                    return false;
                }
            }
        return true;
    }
    public boolean verificarPosicao (int i, int j) {
        if (jogoDaVelha [i][j] == 3) {
            return true;
        }
        return false;
    }
    public int verificadorGanhador () {
        int contDiagPrinc1 = 0;
        int contDiagSec1 = 0;
        int contDiagPrinc2 = 0;
        int contDiagSec2 = 0;
        int contLinha0Jog1 = 0;
        int contLinha1Jog1 = 0;
        int contLinha2Jog1 = 0;
        int contLinha0Jog2 = 0;
        int contLinha1Jog2 = 0;
        int contLinha2Jog2 = 0;
        int contColuna0Jog1 = 0;
        int contColuna1Jog1 = 0;
        int contColuna2Jog1 = 0;
        int contColuna0Jog2 = 0;
        int contColuna1Jog2 = 0;
        int contColuna2Jog2 = 0;

        for (int i = 0; i < jogoDaVelha.length; i++)
            for (int j = 0; j < jogoDaVelha[0].length; j++) {
                if (i == j) {
                    if (jogoDaVelha [i][j] == 1) {
                        contDiagPrinc1++;
                    }
                    if (jogoDaVelha [i][j] == 0) {
                        contDiagPrinc2++;
                    }
                }
                if (i == jogoDaVelha[0].length - 1 - j) {
                    if (jogoDaVelha [i][j] == 1) {
                        contDiagSec1++;
                    }
                    if (jogoDaVelha [i][j] == 0) {
                        contDiagSec2++;
                    }
                }
                if (i == 0) {
                    if (jogoDaVelha [0][j] == 1) {
                        contLinha0Jog1++;
                    }
                    if (jogoDaVelha [0][j] == 0) {
                        contLinha0Jog2++;
                    }
                }
                if (i == 1) {
                    if (jogoDaVelha [1][j] == 1) {
                        contLinha1Jog1++;
                    }
                    if (jogoDaVelha [1][j] == 0) {
                        contLinha1Jog2++;
                    }
                }
                if (i == 2) {
                    if (jogoDaVelha [2][j] == 1) {
                        contLinha2Jog1++;
                    }
                    if (jogoDaVelha [2][j] == 0) {
                        contLinha2Jog2++;
                    }
                }
                if (j == 0) {
                    if (jogoDaVelha [i][0] == 1) {
                        contColuna0Jog1++;
                    }
                    if (jogoDaVelha [i][0] == 0) {
                        contColuna0Jog2++;
                    }
                }
                if (j == 1) {
                    if (jogoDaVelha [i][1] == 1) {
                        contColuna1Jog1++;
                    }
                    if (jogoDaVelha [i][1] == 0) {
                        contColuna1Jog2++;
                    }
                }
                if (j == 2) {
                    if (jogoDaVelha [i][2] == 1) {
                        contColuna2Jog1++;
                    }
                    if (jogoDaVelha [i][2] == 0) {
                        contColuna2Jog2++;
                    }
                }
            }
        if (contColuna0Jog1 == 3 || contColuna1Jog1 == 3 || contColuna2Jog1 == 3 || contLinha0Jog1 == 3 || contLinha1Jog1 == 3 || contLinha2Jog1 == 3 || contDiagPrinc1 == 3 || contDiagSec1 == 3) {
            return 1;
        }
        if (contColuna0Jog2 == 3 || contColuna1Jog2 == 3 || contColuna2Jog2 == 3 || contLinha0Jog2 == 3 || contLinha1Jog2 == 3 || contLinha2Jog2 == 3 || contDiagPrinc2 == 3 || contDiagSec2 == 3) {
            return 2;
        }
        //Empate:
        return 3;
    }
    public void printMatriz () {
        int aux [][] = new int [4][4];
        for (int i = 0; i < aux.length; i++)
            for (int j = 0; j < aux[0].length; j++) {
                if (i > 0 && j > 0) {
                    aux[i][j] = jogoDaVelha[i-1][j-1];
                }
            }
        for (int i = 0; i < aux.length; i++)
            for (int j = 0; j < aux[0].length; j++) {
                if (i == 1 && j == 1) {
                    System.out.print("0");
                }
                if (i == 2 && j == 1) {
                    System.out.print("1");
                }
                if (i == 3 && j == 1) {
                    System.out.print("2");
                }
                if (i == 0 && j == 1) {
                    System.out.print("   0");
                }
                if (i == 0 && j == 2) {
                    System.out.print("  1");
                }
                if (i == 0 && j == 3) {
                    System.out.print("  2");
                }
                if (i > 0 && j > 0) {
                    System.out.print("  " + alteradorDeNumerosParaSimbolos(jogoDaVelha[i-1][j-1]));
                }
                if (i == 0 && j == 3) {
                    System.out.print("\n");
                }
                if (i == 1 && j == 3) {
                    System.out.print("\n");
                }
                if (i == 2 && j == 3) {
                    System.out.print("\n");
                }
                if (i == 3 && j == 3) {
                    System.out.print("\n");
                }
            }
    }
    public static String alteradorDeNumerosParaSimbolos (int x) {
        String simbolo = null;
        if (x == 1) {
            simbolo = "X";
        }
        else if (x == 0) {
            simbolo = "O";
        }
        else if (x == 3) {
            simbolo = ".";
        }
        return  simbolo;
    }
    public void executar () {
        JogoDaVelha jogoDaVelha = new JogoDaVelha();
        Scanner scan = new Scanner(System.in);
        String player1;
        String player2;
        int cont = 0;
        int linha;
        int coluna;
        System.out.println("=-==-=-==-=-==-=-==-=-==-=-==-=-==" +
                "\n Bem vindo ao jogo da velha ESUP!" +
                "\n  Cadastre os jogadores abaixo \n\n");
        System.out.print("Player 1 " +
                "\n---> ");
        player1 = scan.nextLine();
        System.out.print("Player 2" +
                "\n ---> ");
        player2 = scan.nextLine();
        JogoDaVelha.limparTela();
        System.out.println("Aperte qualquer tecla para começar o jogo!");
        String start = scan.nextLine();
        jogoDaVelha.iniciarJogo();
        JogoDaVelha.limparTela();
        jogoDaVelha.printMatriz();
        while (cont != 8) {
            System.out.println("\nVez do " + player1 + "...");
            System.out.println("Informe a linha e a coluna a ser preenchida:");
            System.out.print("Linha ->");
            linha = scan.nextInt();
            System.out.print("Coluna ->");
            coluna = scan.nextInt();
            while (linha > 2 || coluna > 2 || linha < 0 || coluna < 0) {
                System.out.print("\nPosição inválida!\n");
                System.out.println("Informe a linha e a coluna a ser preenchida:");
                System.out.print("Linha ->");
                linha = scan.nextInt();
                System.out.print("Coluna ->");
                coluna = scan.nextInt();
            }
            while (!jogoDaVelha.verificarPosicao(linha, coluna)) {
                System.out.println("\nA posição solicitada já está preenchida!\n");
                System.out.println("Informe a linha e a coluna a ser preenchida:");
                System.out.print("Linha ->");
                linha = scan.nextInt();
                System.out.print("Coluna ->");
                coluna = scan.nextInt();
            }
            jogoDaVelha.movimentoJogador1(linha, coluna);
            cont ++;
            JogoDaVelha.limparTela();
            jogoDaVelha.printMatriz();
            if (jogoDaVelha.verificadorGanhador() == 1) {
                System.out.println("\n" + player1 + " venceu!!");
                System.exit(0);
            }
            System.out.println("\nVez do " + player2 + "...");
            System.out.println("Informe a linha e a coluna a ser preenchida:");
            System.out.print("Linha ->");
            linha = scan.nextInt();
            System.out.print("Coluna ->");
            coluna = scan.nextInt();
            while (linha > 2 || coluna > 2 || linha < 0 || coluna < 0) {
                System.out.print("\nPosição inválida!\n");
                System.out.println("Informe a linha e a coluna a ser preenchida:");
                System.out.print("Linha ->");
                linha = scan.nextInt();
                System.out.print("Coluna ->");
                coluna = scan.nextInt();
            }
            while (!jogoDaVelha.verificarPosicao(linha, coluna)) {
                System.out.println("\nA posição solicitada já está preenchida!\n ");
                System.out.println("Informe a linha e a coluna a ser preenchida:");
                System.out.print("Linha ->");
                linha = scan.nextInt();
                System.out.print("Coluna ->");
                coluna = scan.nextInt();
            }
            jogoDaVelha.movimentoJogador2(linha, coluna);
            if (jogoDaVelha.verificadorGanhador() == 2) {
                System.out.println("\n" + player2 + " venceu!!");
                System.exit(0);
            }
            cont ++;
            JogoDaVelha.limparTela();
            jogoDaVelha.printMatriz();
        }
        if (jogoDaVelha.verificadorGanhador() == 3) {
            System.out.println("Empate");
        }
    }
    public static void limparTela () {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}

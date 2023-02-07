package com.mycompany.monopolio;

import java.util.Scanner;

// Hacjesse

public class Menu {

    public Menu() {
    }
    
    public void Monopolio(){
        Propriedade[] propriedades = new Propriedade[41];
        propriedades[0] = new Propriedade("Go", 60, 16,"1" );
        propriedades[1] = new Propriedade("Praça do 3 poderes", 60, 30,"2" );
        propriedades[2] = new Propriedade("Mediterranean Avenue", 90, 23,"3" );
        propriedades[3] = new Propriedade("Community Chest", 100, 40, "4");
        propriedades[4] = new Propriedade("Income Tax", 200, 30, "5");
        propriedades[5] = new Propriedade("Reading Railroad", 110, 25, "6");
        propriedades[6] = new Propriedade("Oriental Avenue", 120, 6, "7");
        propriedades[7] = new Propriedade("Chance", 200, 40, "8");
        propriedades[8] = new Propriedade("Vermont Avenue", 200, 47, "9");
        propriedades[9] = new Propriedade("Connecticut Avenue", 120, 8, "10");
        propriedades[10] = new Propriedade("Jail", "11");
        propriedades[11]= new Propriedade("St. Charles Place", 120, 22, "12");
        propriedades[12]= new Propriedade("Electric Company", 120, 22, "12");
        propriedades[13]= new Propriedade("States Avenue", 120, 23, "14");
        propriedades[14]= new Propriedade("Virginia Avenue", 120, 28, "15");
        propriedades[15]= new Propriedade("Pennsylvania Railroad", 120, 43, "16");
        propriedades[16]= new Propriedade("St. James Place", 260, 37, "17");
        propriedades[17]= new Propriedade("Community Chest 2", 280, 34, "18");
        propriedades[18]= new Propriedade("Tennessee Avenue", 320, 43, "19");
        propriedades[19]= new Propriedade("New York Avenue", 80, 34, "20");
        propriedades[20]= new Propriedade("Free Parking", 110, 54, "21");
        propriedades[21]= new Propriedade("Kentucky Avenue", 110, 38, "22");
        propriedades[22]= new Propriedade("Chance 2", 300, 88, "23");
        propriedades[23]= new Propriedade("Indiana Avenue", 130, 38, "24");
        propriedades[24]= new Propriedade("Illinois Avenue", 120, 58, "25");
        propriedades[25]= new Propriedade("B&O Railroad", 120, 28, "26");
        propriedades[26]= new Propriedade("Atlantic Avenue", 220, 51, "27");
        propriedades[27]= new Propriedade("Ventnor Avenue", 160, 54, "28");
        propriedades[28]= new Propriedade("Water Works", 180, 34, "29");
        propriedades[29]= new Propriedade("Marvin Gardens", 130, 34, "30");
        propriedades[30]= new Propriedade("Go to Jail", "31");
        propriedades[31]= new Propriedade("Pacific Avenue", 90, 12, "32");
        propriedades[32]= new Propriedade("North Carolina Avenue", 320, 8, "33");
        propriedades[33]= new Propriedade("Community Chest 3", 110, 22, "34");
        propriedades[34]= new Propriedade("Pennsylvania Avenue", 100, 43, "35");
        propriedades[35]= new Propriedade("Shortline Railroad", 180, 18, "36");
        propriedades[36]= new Propriedade("Chance 3", 190, 38, "37");
        propriedades[37]= new Propriedade("Park Place", 350, 158, "38");
        propriedades[38]= new Propriedade("Luxury Tax", 120, 8, "39");
        propriedades[39]= new Propriedade("Board Work", 400, 208, "40");
        propriedades[40]= new Propriedade("Avenida Juscelino Kubitschek", 0, 0, "41");
    
        Tabuleiro tabuleiro = new Tabuleiro(propriedades);

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n======MONOPOLY======");
        System.out.println("1. Jogar");
        System.out.println("2. Sair");
        int opc = scanner.nextInt();

        switch (opc) {
            case 1:
                System.out.print("Digite o numero de jogadores (2-4): ");
                int numeroJogadores = scanner.nextInt();
                scanner.nextLine();
                Jogo jogo = new Jogo(numeroJogadores, tabuleiro, scanner);
                jogo.iniciarJogo();
            case 2:
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

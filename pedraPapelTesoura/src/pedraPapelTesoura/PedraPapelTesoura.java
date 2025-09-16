package pedraPapelTesoura;

import java.util.Scanner;
import java.util.Random;

public class PedraPapelTesoura {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("=== Pedra, Papel ou Tesoura ===");
        System.out.println("Digite sua escolha:");
        System.out.println("0 - Pedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tesoura");

        int escolhaJogador = entrada.nextInt();
        int escolhaComputador = random.nextInt(3); 

        // Mostrar escolhas
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        System.out.println("Você escolheu: " + opcoes[escolhaJogador]);
        System.out.println("Computador escolheu: " + opcoes[escolhaComputador]);

        // Simulando "analisando..."
        System.out.print("Analisando");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500); // espera 0.5s
            System.out.print(".");
        }
        System.out.println();
        
        // Determinar vencedor
        if (escolhaJogador == escolhaComputador) {
            System.out.println("Empate!");
        } else if (
            (escolhaJogador == 0 && escolhaComputador == 2) ||
            (escolhaJogador == 1 && escolhaComputador == 0) ||
            (escolhaJogador == 2 && escolhaComputador == 1)
        ) {
            System.out.println("Você ganhou!");
        } else {
            System.out.println("Você perdeu!");
        }

        entrada.close();
    }
}

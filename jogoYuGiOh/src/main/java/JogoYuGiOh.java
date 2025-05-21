package jogoYuGiOh;

import java.util.Scanner;
import model.Jogador;
import model.Carta;
import state.JogoContexto;
import strategy.GerenciadorCombate;

public class JogoYuGiOh {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Yugi");
        Jogador jogador2 = new Jogador("Kaiba");
        GerenciadorCombate gerenciador = new GerenciadorCombate();
        JogoContexto contexto = new JogoContexto();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("\nRodada " + (i + 1));
            Carta cartaYugi = selecionarCarta(jogador1, scanner);
            Carta cartaKaiba = selecionarCarta(jogador2, scanner);

            gerenciador.realizarCombate(jogador1, cartaYugi, "ATAQUE", jogador2, cartaKaiba, "DEFESA");
            contexto.executar(jogador1, jogador2, gerenciador);
        }

        exibirVencedorFinal(jogador1, jogador2);
        scanner.close();
    }

    private static Carta selecionarCarta(Jogador jogador, Scanner scanner) {
        System.out.println("\nDeck de " + jogador.getNome() + ":");
        int index = 0;
        for (Carta carta : jogador.getDeck()) {
            System.out.println(index++ + " - " + carta);
        }

        System.out.print("Escolha sua carta pelo número, " + jogador.getNome() + ": ");
        int escolha = scanner.nextInt();
        return (Carta) jogador.getDeck().toArray()[escolha]; // Converte Set para Array para pegar pelo índice
    }

    private static void exibirVencedorFinal(Jogador jogador1, Jogador jogador2) {
        System.out.println("\nPlacar Final: " + jogador1.getNome() + " " + jogador1.getPontos() + " x " + jogador2.getPontos() + " " + jogador2.getNome());

        if (jogador1.getPontos() > jogador2.getPontos()) {
            System.out.println(jogador1.getNome() + " é o grande vencedor!");
        } else if (jogador2.getPontos() > jogador1.getPontos()) {
            System.out.println(jogador2.getNome() + " é o grande vencedor!");
        } else {
            System.out.println("O jogo terminou empatado!");
        }
    }
}

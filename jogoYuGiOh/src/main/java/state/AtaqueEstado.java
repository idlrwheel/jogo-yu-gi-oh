package state;

import model.Jogador;
import model.Carta;
import strategy.GerenciadorCombate;

import java.util.Scanner;

public class AtaqueEstado implements EstadoJogo {
    @Override
    public void executar(JogoContexto contexto, Jogador jogador1, Jogador jogador2, GerenciadorCombate gerenciador) {
        System.out.println("=== FASE DE ATAQUE ===");
        Scanner sc = new Scanner(System.in);

   
        Carta carta1 = jogador1.getDeck().iterator().next();
        Carta carta2 = jogador2.getDeck().iterator().next();

        System.out.println(jogador1.getNome() + " vai atacar com " + carta1);
        System.out.println(jogador2.getNome() + " vai atacar com " + carta2);

        int resultado = gerenciador.realizarCombate(jogador1, carta1, "ATAQUE", jogador2, carta2, "ATAQUE");

        contexto.setEstado(new DefesaEstado());
    }
}
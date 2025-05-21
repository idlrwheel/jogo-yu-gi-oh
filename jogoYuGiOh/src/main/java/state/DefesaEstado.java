package state;

import model.Jogador;
import model.Carta;
import strategy.GerenciadorCombate;

public class DefesaEstado implements EstadoJogo {
    @Override
    public void executar(JogoContexto contexto, Jogador jogador1, Jogador jogador2, GerenciadorCombate gerenciador) {
        System.out.println("=== FASE DE DEFESA ===");

        Carta carta1 = jogador1.getDeck().iterator().next();
        Carta carta2 = jogador2.getDeck().iterator().next();

        System.out.println(jogador1.getNome() + " vai defender com " + carta1);
        System.out.println(jogador2.getNome() + " vai defender com " + carta2);

        int resultado = gerenciador.realizarCombate(jogador1, carta1, "DEFESA", jogador2, carta2, "DEFESA");

        contexto.setEstado(new FimEstado());
    }
}
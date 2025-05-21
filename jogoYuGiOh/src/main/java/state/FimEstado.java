package state;

import model.Jogador;
import strategy.GerenciadorCombate;

public class FimEstado implements EstadoJogo {
    @Override
    public void executar(JogoContexto contexto, Jogador jogador1, Jogador jogador2, GerenciadorCombate gerenciador) {
        System.out.println("=== FIM DO JOGO ===");
    }
}
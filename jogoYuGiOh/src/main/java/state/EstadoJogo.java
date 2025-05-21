package state;

import model.Jogador;
import strategy.GerenciadorCombate;

public interface EstadoJogo {
    void executar(JogoContexto contexto, Jogador jogador1, Jogador jogador2, GerenciadorCombate gerenciador);
}
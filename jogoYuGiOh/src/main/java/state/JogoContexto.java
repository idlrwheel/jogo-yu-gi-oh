package state;

import model.Jogador;
import strategy.GerenciadorCombate;

public class JogoContexto {
    private EstadoJogo estado;

    public JogoContexto() {
        this.estado = new InicioEstado();
    }

    public void setEstado(EstadoJogo estado) {
        this.estado = estado;
    }

    public void executar(Jogador jogador1, Jogador jogador2, GerenciadorCombate gerenciador) {
        estado.executar(this, jogador1, jogador2, gerenciador);
    }
}
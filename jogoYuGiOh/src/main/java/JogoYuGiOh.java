package jogoYuGiOh;

import model.Jogador;
import strategy.GerenciadorCombate;
import state.JogoContexto;

public class JogoYuGiOh {

    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Yugi");
        Jogador jogador2 = new Jogador("Kaiba");
        GerenciadorCombate gerenciador = new GerenciadorCombate();
        JogoContexto contexto = new JogoContexto();

        contexto.executar(jogador1, jogador2, gerenciador); 
        contexto.executar(jogador1, jogador2, gerenciador); 
        contexto.executar(jogador1, jogador2, gerenciador); 
        contexto.executar(jogador1, jogador2, gerenciador); 
    }
}

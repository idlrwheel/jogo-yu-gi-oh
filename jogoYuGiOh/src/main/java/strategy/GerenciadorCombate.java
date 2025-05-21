package strategy;

import java.util.HashMap;
import java.util.Map;
import model.Carta;
import model.Jogador;

public class GerenciadorCombate {
    private Map<String, EstrategiaCombate> estrategias;

    public GerenciadorCombate() {
        this.estrategias = new HashMap<>();
        this.estrategias.put("ATAQUE vs ATAQUE", new CombateAvsA());
        this.estrategias.put("ATAQUE vs DEFESA", new CombateAvsD());
        this.estrategias.put("DEFESA vs ATAQUE", new CombateDvsA());
        this.estrategias.put("DEFESA vs DEFESA", new CombateDvsD());
    }

    public void realizarCombate(Jogador jogador1, Carta cartaJogador1, String estadoJogador1,
                                Jogador jogador2, Carta cartaJogador2, String estadoJogador2) {
        String chaveCombate = estadoJogador1.toUpperCase() + " vs " + estadoJogador2.toUpperCase();
        EstrategiaCombate estrategia = estrategias.getOrDefault(chaveCombate, estrategias.get("ATAQUE vs DEFESA"));

        if (estrategia != null) {
            int resultado = estrategia.executarCombate(jogador1, cartaJogador1, estadoJogador1, jogador2, cartaJogador2, estadoJogador2);

            if (resultado == 1) {
                jogador1.adicionarPonto();
            } else if (resultado == 2) {
                jogador2.adicionarPonto();
            }
        } else {
            System.out.println("Estratégia de combate inválida: " + chaveCombate);
        }
    }
}

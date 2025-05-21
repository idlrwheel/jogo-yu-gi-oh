/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import java.util.HashMap;
import java.util.Map;
import model.Carta;
import model.Jogador;

/**
 *
 * @author Giovanna
 */
public class GerenciadorCombate {
    private Map<String, EstrategiaCombate> estrategias;

    public GerenciadorCombate() {
        this.estrategias = new HashMap<>();
        this.estrategias.put("ATAQUE vs ATAQUE", new CombateAvsA());
        this.estrategias.put("ATAQUE vs DEFESA", new CombateAvsD());
        this.estrategias.put("DEFESA vs ATAQUE", new CombateDvsA()); 
        this.estrategias.put("DEFESA vs DEFESA", new CombateDvsD());
    }

    public int realizarCombate(Jogador jogador1, Carta cartaJogador1, String estadoJogador1,
                                Jogador jogador2, Carta cartaJogador2, String estadoJogador2) {
        String chaveCombate = estadoJogador1.toUpperCase() + " vs " + estadoJogador2.toUpperCase();

        EstrategiaCombate estrategia;
        if (chaveCombate.equals("DEFESA vs ATAQUE")) {
            estrategia = estrategias.get("ATAQUE vs DEFESA");
        } else {
            estrategia = estrategias.get(chaveCombate);
        }

        if (estrategia != null) {
            return estrategia.executarCombate(jogador1, cartaJogador1, estadoJogador1, jogador2, cartaJogador2, estadoJogador2);
        } else {
            System.out.println("Estratégia de combate inválida para: " + chaveCombate);
            return 0; 
        }
    }
}

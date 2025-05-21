/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import model.Carta;
import model.Jogador;

/**
 *
 * @author Giovanna
 */
public class CombateDvsD implements EstrategiaCombate {
    @Override
    public int executarCombate(Jogador jogador1, Carta cartaJogador1, String estadoJogador1, Jogador jogador2, Carta cartaJogador2, String estadoJogador2) {
        System.out.println("Combate: Defesa vs Defesa.");
        System.out.println(jogador1.getNome() + " jogou: " + " (Defesa: " + cartaJogador1.getDefesa() + ")");
        System.out.println(jogador2.getNome() + " jogou: " + " (Defesa: " + cartaJogador2.getDefesa() + ")");
        return 0;
    }
    
}

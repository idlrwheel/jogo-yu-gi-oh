/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package strategy;

import model.Carta;
import model.Jogador;

/**
 *
 * @author Giovanna
 */
public interface EstrategiaCombate {
    int executarCombate(Jogador jogador1, Carta cartaJogador1, String estadoJogador1,
                        Jogador jogador2, Carta cartaJogador2, String estadoJogador2);
}

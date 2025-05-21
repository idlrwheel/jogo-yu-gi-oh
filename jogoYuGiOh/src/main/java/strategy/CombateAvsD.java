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
public class CombateAvsD implements EstrategiaCombate {
@Override
    public int executarCombate(Jogador jogador1, Carta cartaJogador1, String estadoJogador1, Jogador jogador2, Carta cartaJogador2, String estadoJogador2) {
        System.out.println("Combate: Ataque vs Defesa");
        System.out.println(jogador1.getNome() + " jogou: " +  " (Ataque: " + cartaJogador1.getAtaque() + ")");
        System.out.println(jogador2.getNome() + " jogou: " + " (Defesa: " + cartaJogador2.getDefesa() + ")");

        if (cartaJogador1.getAtaque() > cartaJogador2.getDefesa()) {
            System.out.println(jogador1.getNome() + " vence a rodada!");
            return 1;
        } else if (cartaJogador2.getDefesa() > cartaJogador1.getAtaque()) {
            System.out.println(jogador2.getNome() + " vence a rodada!");
            return 2;
        } else {
            System.out.println("Empate na rodada!");
            return 0;
        }
    }}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Giovanna
 */
public class Jogador {
     private String nome;
    private Set<Carta> deck; 
    private List<Carta> mao; 

    public Jogador(String nome) {
        this.nome = nome;
        this.deck = new HashSet<>();
        this.mao = new ArrayList<>();
        inicializarDeckAleatorio(); 
    }

    public String getNome() {
        return nome;
    }

    public Set<Carta> getDeck() {
        return deck;
    }

    public List<Carta> getMao() {
        return mao;
    }

    private void inicializarDeckAleatorio() {
        while (deck.size() < 6) {
            Carta novaCarta = CartaFactory.gerarCartaAleatoria();
            deck.add(novaCarta); 
        }
    }

}

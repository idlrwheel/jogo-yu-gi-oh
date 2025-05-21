package model;

import factory.CartaFactory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jogador {
    private String nome;
    private Set<Carta> deck;
    private List<Carta> mao;
    private int pontos;

    public Jogador(String nome) {
        this.nome = nome;
        this.deck = new HashSet<>();
        this.mao = new ArrayList<>();
        this.pontos = 0;
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

    public int getPontos() {
        return pontos;
    }

    public void adicionarPonto() {
        pontos++;
    }

    private void inicializarDeckAleatorio() {
        while (deck.size() < 6) {
            Carta novaCarta = CartaFactory.gerarCartaAleatoria();
            deck.add(novaCarta);
        }
    }
}

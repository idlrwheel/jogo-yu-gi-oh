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
    private Set<Carta> deck; // Usamos Set para garantir cartas únicas no deck
    private List<Carta> mao; // Usamos List para permitir múltiplas cópias na mão se fosse o caso, mas aqui é para exibir
    private EstadoDoJogador estadoAtual;

    public Jogador(String nome) {
        this.nome = nome;
        this.deck = new HashSet<>();
        this.mao = new ArrayList<>();
        this.estadoAtual = new EstadoAtaque(); // Estado inicial padrão
        inicializarDeckAleatorio(); // Gera 6 cartas aleatórias e únicas para o deck
    }

    public String getNome() {
        return nome;
    }

    // Retorna o deck (conjunto de cartas originais)
    public Set<Carta> getDeck() {
        return deck;
    }

    // Retorna as cartas que o jogador tem na mão para jogar
    public List<Carta> getMao() {
        return mao;
    }

    public EstadoDoJogador getEstadoAtual() {
        return estadoAtual;
    }

    public void setEstadoAtual(EstadoDoJogador novoEstado) {
        this.estadoAtual = novoEstado;
        String nomeEstado = novoEstado.getClass().getSimpleName().replace("Estado", "");
        System.out.println(nome + " mudou para o estado: " + nomeEstado.toUpperCase());
    }

    // Inicializa o deck do jogador com 6 cartas aleatórias e únicas
    private void inicializarDeckAleatorio() {
        while (deck.size() < 6) {
            Carta novaCarta = CartaFactory.criarCartaAleatoria();
            deck.add(novaCarta); // HashSet garante que só adicionará se a carta for única (baseado no equals/hashCode de Carta)
        }
    }

    public void escolherEstado(String estado) {
        estadoAtual.escolherEstado(this, estado);
    }

    public void jogarCarta(Carta carta) {
        if (mao.contains(carta)) {
            estadoAtual.jogarCarta(this, carta);
            mao.remove(carta);
        } else {
            System.out.println("Erro: Carta não está na mão de " + nome + ".");
        }
    }
}

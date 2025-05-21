/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Giovanna
 */
public class Carta {
    private int ataque;
    private int defesa;

    public Carta(int ataque, int defesa) {
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
    
     @Override
    public String toString() {
        return "(Ataque: " + ataque + ", Defesa: " + defesa + ")";
    }
}

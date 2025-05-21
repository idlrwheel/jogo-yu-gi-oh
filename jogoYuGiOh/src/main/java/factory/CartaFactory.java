/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory;

import java.util.Random;
import model.Carta;

/**
 *
 * @author Giovanna
 */
public class CartaFactory {
     private static final Random random = new Random();
     
     private static Carta gerarCartaAleatoria(){
         int ataque = random.nextInt(10) + 1;
         int defesa = random.nextInt(10) + 1;
         return new Carta(ataque, defesa);
     }
}

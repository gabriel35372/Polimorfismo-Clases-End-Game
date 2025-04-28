/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.endgame;

import com.mycompany.EndGame.Avenger;
import com.mycompany.EndGame.Heroe;
import com.mycompany.EndGame.Personaje;
import com.mycompany.EndGame.Thanos;
import com.mycompany.EndGame.Villano;



/**
 *
 * @author joseg
 */
public class Endgame{
    
    public static void main(String[] args) {
        Heroe blackPanther = new Heroe("Black Panter ", "Ser el rey de todo Wakanda", "Garras de Vibranium");
        Villano galactus;
        galactus = new Villano("Galactus el devorador de mundos", "Devorar mundos", "usa de chalan a Silver Surfer");
        Avenger ironMan = new Avenger("Tony Stark", "Genio" , "Mark 42", "Prime");
        Thanos thanos = new Thanos("Thanos", "El Titan loco", "ejercito Chitaury", "Gemas del infinito");
        
        //Aplicando Polimorfismo
        
        Personaje[]personajes = {blackPanther,galactus,ironMan,thanos};
        for(Personaje personaje : personajes){
            personaje.atacar();
        }
        
        //Método especifico de Avenger
        
        ((Avenger)ironMan).reunirse();
        
        //Ejemplo metodo especifico de Thanos
        thanos.chasquearDedos();
    }
}
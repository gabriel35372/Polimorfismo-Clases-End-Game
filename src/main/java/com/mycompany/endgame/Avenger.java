/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EndGame;

/**
 *
 * @author joseg
 */
public class Avenger extends Heroe{
    protected String equipo;
    
    public Avenger(String nombre, String poder, String arma, String equipo){
        super(nombre, poder, arma);
        this.equipo = equipo;
    }
     
    public void reunirse(){
        String gabriel;
        gabriel = null;
        System.out.println(gabriel+"se une al equipo"+equipo+"de los avengers");
    }    
}
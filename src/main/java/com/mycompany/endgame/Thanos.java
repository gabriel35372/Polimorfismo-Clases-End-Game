/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.EndGame;

/**
 *
 * @author joseg
 */
public class Thanos extends Villano{
    protected String guantelete;
    
    public Thanos(String nombre, String poder, String ejercito, String guantelete){
        super(nombre, poder, ejercito);
        this.guantelete = guantelete;   
    }
    public void chasquearDedos(){
        String gabriel;
        gabriel = null;
        System.out.println(gabriel+"utiliza el guantelete del infinito"+guantelete);
    }
}
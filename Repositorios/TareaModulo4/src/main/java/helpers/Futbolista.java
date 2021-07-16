/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author SALINAS
 */
public class Futbolista {
 
 public String nombre;
 public int edad;
 private String equipoActual;
 public String presidente;
 
 public Futbolista{String nombre, int edad, String equipoActual,String presidente }{
 this.nombre = nombre;
 this.edad = edad;
 this.equipoActual = equipoActual;
 this.presidente = presidente;
 
 }

public void imprimirequipoActual{}{
    System.out.println(equipoActual);
}
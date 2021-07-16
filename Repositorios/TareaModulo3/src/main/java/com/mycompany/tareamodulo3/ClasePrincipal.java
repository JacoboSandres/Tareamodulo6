package com.mycompany.tareamodulo3;

public class ClasePrincipal {

    public static void main(String[] args){
        
     System.out.println("----------- Soy Programador de UTH -----------");
        
     Arquitecto arquitecto= new Arquitecto();
     
     arquitecto.setIdentidad("0108198012345");
     arquitecto.setNombre("Jacobo Leonel Sandres");
     arquitecto.setTelefono("99887766");
     arquitecto.setEdad("38");
      
     System.out.println("La Identidad del Arquitecto es: "+ arquitecto.getIdentidad());
     System.out.println("El nombre del Arquitecto es: "+ arquitecto.getNombre());
     System.out.println("El Telefono Celular del Arquitecto es: "+ arquitecto.getTelefono());
     System.out.println("La Edad del Arquitecto es: "+ arquitecto.getEdad());
}
}

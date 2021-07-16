package com.mycompany.tareamodulo1;

import java.util.Scanner;
public class Ejercicio4 {
    
public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String []arreglo=new String[20]; 
    String numero;
    
    for(int i=0;i<arreglo.length;i++){
    System.out.println((i+1)+" Escriba el nombre de la Ciudad: ");
    numero = leer.nextLine();
    arreglo[i]=numero;
    
    }
    for (String arreglo1 : arreglo) {
        System.out.println(" El nombre de la ciudad es: " + arreglo1);
    }
}
}




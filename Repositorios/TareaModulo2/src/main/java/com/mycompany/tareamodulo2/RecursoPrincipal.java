package com.mycompany.tareamodulo2;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RecursoPrincipal {
    //Atributos
    int edad;
    int num1;
    int num2;
    int res;
    int arreglo;
    //int i;
    int nElementos;
        
        
    //Metodo #1
    public void mensaje() {
    System.out.println("Metodo 1----------- Programacion Orientada a Objetos 2021-----------");
    
    }
        
    //Metodo #2
   public void edades() {
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la Edad del Estudiante: ")); 
        
    }
    
    //Metodo #3
    public void multiplicacion(){ 
       num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a multiplicar: ")); 
       num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero a multiplicar: ")); 
       res=num1*num2;
    
    }
   
    //Metodo #4
    public void arreglos(){ 
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Metodo 4. Digite los elementos del arreglo");
    nElementos=entrada.nextInt();
    
    for(int i=1;i<nElementos;i++){
    System.out.println(i);   
    }
    }
    
    //Metodo#5
    public void mostrarejercicio(){
    System.out.println("Metodo 2. La Edad del Estudiante es: "+ edad);
    System.out.println("Metodo 3. El resultado de la multiplicacion es: "+ res);
    }
}


package Herencias;

public class Cuadrado extends Formas{
    private int Area;
    private String CalcularArea;

    public Cuadrado(String Color,String Dibujar,String EstablecerColor,int Area,String CalcularArea){
        super(Color,Dibujar,EstablecerColor);
        this.Area = Area;
        this.CalcularArea = CalcularArea;
    }

    public void mostrarDatosCuadrado(){
        System.out.println("Color: "+getColor()+
                "\nDibujar: "+getDibujar()+
                "\nEstablecerColor: "+getEstablecerColor()+
                "\nRadio: "+Area+
                "\nCalcular Radio: "+CalcularArea);
     }
}
  

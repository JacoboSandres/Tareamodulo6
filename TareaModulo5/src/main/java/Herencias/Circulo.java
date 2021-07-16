package Herencias;

public class Circulo extends Formas{
    private int Radio;
    private String CalcularRadio;

    public Circulo(String Color,String Dibujar,String EstablecerColor,int Radio,String CalcularRadio){
        super(Color,Dibujar,EstablecerColor);
        this.Radio = Radio;
        this.CalcularRadio = CalcularRadio;
    }

    public void mostrarDatosCirculo(){
        System.out.println("Color: "+getColor()+
                "\nDibujar: "+getDibujar()+
                "\nEstablecerColor: "+getEstablecerColor()+
                "\nRadio: "+Radio+
                "\nCalcular Radio: "+CalcularRadio);
     }
}

package Herencias;

public class Triangulo extends Formas{
    private int Angulo;
    private String CalcularArea;

    public Triangulo(String Color,String Dibujar,String EstablecerColor,int Angulo,String CalcularArea){
        super(Color,Dibujar,EstablecerColor);
        this.Angulo = Angulo;
        this.CalcularArea = CalcularArea;
    }

    public void mostrarDatosTriangulo(){
        System.out.println("Color: "+getColor()+
                "\nDibujar: "+getDibujar()+
                "\nEstablecerColor: "+getEstablecerColor()+
                "\nRadio: "+Angulo+
                "\nCalcular Radio: "+CalcularArea);
     }
}
    

package Herencias;

public class Lineas extends Formas{
    private int Largo;
    
    public Lineas(String Color,String Dibujar,String EstablecerColor,int Largo){
        super(Color,Dibujar,EstablecerColor);
        this.Largo = Largo;
        }

    public void mostrarDatosLinea(){
        System.out.println("Color: "+getColor()+
                "\nDibujar: "+getDibujar()+
                "\nEstablecerColor: "+getEstablecerColor()+
                "\nRadio: "+Largo);
     }
}
    


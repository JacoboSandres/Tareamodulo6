package Herencias;

public class Formas {
    private String color; 
    private String Dibujar;
    private String EstablecerColor;

    public Formas(String color, String Dibujar, String EstablecerColor) {
        this.color = color;
        this.Dibujar = Dibujar;
        this.EstablecerColor = EstablecerColor;
    }

    Formas(String azul, String circulo, String rojo, int i, String el_radio_es_5) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getColor() {
        return color;
    }

    public String getDibujar() {
        return Dibujar;
    }

    public String getEstablecerColor() {
        return EstablecerColor;
    }

      
}

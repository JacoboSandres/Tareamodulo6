package com.mycompany.tareamodulo3;

public class Arquitecto {
    private String identidad;
    private String nombre;
    private String telefono;
    private String edad;
    
    public Arquitecto(){
    
    }
    public Arquitecto(String identidad, String nombre, String telefono, String edad){
        this.setIdentidad(identidad);
        this.setNombre(nombre);
        this.setTelefono(telefono);
        this.setEdad(edad);
    }
    
    
    public String getIdentidad(){
        return identidad;
    }
    public String getNombre(){
        return nombre;
    }
     public String getTelefono(){
        return telefono;
    }
    public String getEdad(){
        return edad;
    }
   
    public void setIdentidad(String _identidad){
        this.identidad = _identidad;
    }
    public void setNombre(String _nombre){
        this.nombre = _nombre;
    }
    public void setTelefono(String _telefono){
        this.telefono = _telefono;
    }
    public void setEdad(String _edad){
        this.edad = _edad;
    }
}
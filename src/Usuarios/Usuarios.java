/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuarios;

import Compras.Compras;

/**
 *
 * @author joses
 */
public class Usuarios {
    
    private String nombre;
    private String genero;
    private int edad;
    private Compras []misCompras = new Compras[10];
    
    public Usuarios(String nombreUsuario){
        this.nombre = nombreUsuario;
    }
    
    public Usuarios(String nombre, String genero, int edad){
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }
    
    //LEER : GETTERS
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getGenero(){
        return this.genero;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    //MODIFICAR : SETTERS
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public void addCompra(int precio, int distancia){
        Compras compraTemporal = new Compras(precio, distancia);
        misCompras[0] = compraTemporal;
    }
}

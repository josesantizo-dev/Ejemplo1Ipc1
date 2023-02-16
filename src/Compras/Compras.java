/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compras;

/**
 *
 * @author joses
 */
public class Compras {
    
    private int precio;
    private int distancia;
    
    public Compras(int precio, int distancia){
        this.precio = precio;
        this.distancia = distancia;
    }
    
    public int getPrecio(){
        return this.precio;
    }
    
    public int getDistancia(){
        return this.distancia;
    }
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public void setDistancia(int distancia){
        this.distancia = distancia;
    }
}

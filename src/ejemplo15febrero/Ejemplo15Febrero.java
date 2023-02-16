/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo15febrero;
import java.util.Scanner;
import Usuarios.Usuarios;

/**
 *
 * @author joses
 */
public class Ejemplo15Febrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Usuarios user = new Usuarios("Raul");
        
        Usuarios user2 = new Usuarios("Ana", "femenino", 25);
        
        
        System.out.println("Nombre: " + user.getNombre());
        System.out.println("Genero de: " + user.getNombre() + " es: " + user.getGenero());
        user.setGenero("Masculino");
        System.out.println("Genero de: " + user.getNombre() + " es: " + user.getGenero());
        System.out.println("Edad de: " + user.getNombre() + " es: " + user.getEdad());
        
        user.addCompra(10, 50);
        
        System.out.println("################################");
        
        System.out.println("Nombre: " + user2.getNombre());
        System.out.println("Genero de: " + user2.getNombre() + " es: " + user2.getGenero());
        System.out.println("Edad de: " + user2.getNombre() + " es: " + user2.getEdad());
    }
    
}

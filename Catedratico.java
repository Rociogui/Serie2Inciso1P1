/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rocio Lopez
 */
public class Catedratico {
    int CodigoCatedratico;
    String nombre;
    String Direccion;
    String Telefono;
    String Profesion;

    public Catedratico(String nombre, String Direccion, String Telefono, String Profesion) {
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Profesion = Profesion;
       
    }

    public void imprimirDatos() {
        System.out.println("Nombre del catedratico: " + nombre);
        System.out.println("Direccion del catedratico: " + Direccion );
        System.out.println("Telefono del catedratico: " + Telefono );
        System.out.println("Su profesion es: " + Profesion );
    }

}

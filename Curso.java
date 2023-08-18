/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rocio Lopez
 */
public class Curso {
    private String nombre;
    private int id;
    private String titulo;
    private int creditos;
    private int cuposDisponibles;
    private int cuposTotales;

    public Curso(String nombre, int id, String titulo, int creditos, int cuposTotales) {
        this.nombre = nombre;
        this.id = id;
        this.titulo = titulo;
        this.creditos = creditos;
        this.cuposTotales = cuposTotales;
        this.cuposDisponibles = cuposTotales;
    }

    Curso(String curso_3, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }
   public String gettitulo() {
        return titulo;
    }

    public void settitulo(String titulo) {
        this.titulo = titulo;
    }
     public int getcreditos() {
        return creditos;
    }

    public void setcreditos(int creditos) {
        this.creditos = creditos;
    }
    public int getCuposDisponibles() {
        return cuposDisponibles;
    }

    public void setCuposDisponibles(int cuposDisponibles) {
        this.cuposDisponibles = cuposDisponibles;
    }

    public int getCuposTotales() {
        return cuposTotales;
    }

    public void setCuposTotales(int cuposTotales) {
        this.cuposTotales = cuposTotales;
    }

    // Método para verificar si hay cupo disponible
    public boolean verificaEspacio() {
        return cuposDisponibles > 0;
    }

    public static void main(String[] args) {
        Curso curso = new Curso("Programación 2", 30);
        
        System.out.println("Nombre del curso: " + curso.getNombre());
        System.out.println("Cupos totales: " + curso.getCuposTotales());
        System.out.println("Cupos disponibles: " + curso.getCuposDisponibles());
        
        if (curso.verificaEspacio()) {
            System.out.println("Hay cupo disponible.");
        } else {
            System.out.println("No hay cupo disponible.");
        }
    }
}


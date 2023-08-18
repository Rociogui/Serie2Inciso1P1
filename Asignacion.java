/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rocio Lopez
 */
public class Asignacion {
    private String nombre;
    private final ArrayList<Curso> cursos;

    public Asignacion(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
             curso.setCuposDisponibles(curso.getCuposDisponibles() - 1);
            System.out.println("Curso " + curso.getNombre() + " Agregado a " + nombre);
        } else {
            System.out.println("Sin cupo disponible para el curso " + curso.getNombre());
        }
    }

    // Método Get
    public String getNombre() {
        return nombre;
    }
    // Método Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void main(String[] args) {
        Curso curso1o = new Curso("Programación 2", 30);
        Curso curso2o = new Curso("Física 1", 20);

        Alumno alumno1 = new Alumno("Maria Godínez");
        Alumno alumno2 = new Alumno("Kimberly Gutiérrez");

        alumno1.addCurso(curso1o);
        alumno1.addCurso(curso2o);
        
        alumno2.addCurso(curso1o);
        alumno2.addCurso(curso2o);
    }

    private static class ArrayList<T> {

        public ArrayList() {
        }

        private void add(Curso curso) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

    }

}


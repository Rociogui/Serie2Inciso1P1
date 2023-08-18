/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Rocio Lopez
 */
public class Test {
    public static void main(String[] args) {
        // Instanciar catedráticos
        Catedratico catedratico1 = new Catedratico("Primer Catedrático", "Dirección 1", "666-0000", "Profesión 1");
        Catedratico catedratico2 = new Catedratico("Segundo Catedrático", "Dirección 2", "666-1111", "Profesión 2");
        Catedratico catedratico3 = new Catedratico("Tercer Catedrático", "Dirección 3", "666-2222", "Profesión 3");

        // Instanciar cursos
        Curso curso1o = new Curso("Curso 1o", 5);
        Curso curso2o = new Curso("Curso 2o", 5);
        Curso curso3o = new Curso("Curso 3o", 2);

        // Instanciar alumnos
        Alumno alumno1 = new Alumno("Primer Alumno");
        Alumno alumno2 = new Alumno("Segundo Alumno");
        Alumno alumno3 = new Alumno("Tercer Alumno");

        // Asignar cursos a alumnos
        alumno1.addCurso(curso1o);
        alumno1.addCurso(curso2o);
        alumno1.addCurso(curso3o);

        alumno2.addCurso(curso1o);
        alumno2.addCurso(curso2o);
        alumno2.addCurso(curso3o);

        alumno3.addCurso(curso1o);
        alumno3.addCurso(curso2o);
        alumno3.addCurso(curso3o);
    }

}

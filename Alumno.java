

/**
 *
 * @author Rocio Lopez
 */
public class Alumno {  
    int Carnet;
    String nombre;
    String Direccion;
    String Telefono;
    String edad;

    public Alumno(int Carnet, String nombre, String Direccion, String Telefono, String edad) {
        this.Carnet = Carnet;
        this.nombre = nombre;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.edad = edad;
       
    }

    Alumno(String alumno_1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void imprimirDatos() {
        System.out.println("Número de Carnet: " + Carnet);
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("Dirección del alumno: " + Direccion );
        System.out.println("Telefono del alumno: " + Telefono );
        System.out.println("Edad del alumno: " + edad );
    }

    void addCurso(Curso curso1) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
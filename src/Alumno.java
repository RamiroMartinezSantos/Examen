public class Alumno {
    String nombreUsuario;
    String nombre;
    String apellido;
    Double edad;
    String direccion;
    Double telefono;
    String correo;
    String semestre;
    String matricula;
    String carrera;
    int libros;
    Double multa;

    public Alumno(String nombreUsuario, String nombre, String apellido, Double edad, String direccion, Double telefono , String correo, String semestre, String matricula, String carrera, int libros,Double multa){
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.semestre = semestre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.libros = libros;
        this.multa = multa;
    }

    @Override
    public String toString(){
        return nombreUsuario + "nombreUsuario" + nombre + "nombre" + apellido + "apellido" + edad + "edad" + direccion + "direccion" + telefono + "telefono" + correo + "correo" + semestre + "semestre" + matricula + "matricula" + carrera + "carrera" + libros + "libros" + multa + "multa";
    }

}

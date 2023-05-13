public class Profesor {
    String nombreUsuario;
    String nombre;
    String apellido;
    Double edad;
    String direccion;
    Double telefono;
    String correo;
    String instituto;
    String area_de_adscripcion;
    int libros;
    Double multa;

    public Profesor(String nombreUsuario, String nombre, String apellido, Double edad, String direccion, Double telefono , String correo, String instituto, String area_de_adscripcion, int libros,Double multa){
        this.nombreUsuario = nombreUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.instituto = instituto;
        this.area_de_adscripcion = area_de_adscripcion;
        this.libros = libros;
        this.multa = multa;
    }

    @Override
    public String toString(){
        return nombreUsuario + "nombreUsuario" + nombre + "nombre" + apellido + "apellido" + edad + "edad" + direccion + "direccion" + telefono + "telefono" + correo + "correo" + instituto + "instituto" + area_de_adscripcion + "area_de_adscripcion" + libros + "libros" + multa + "multa";
    }


}

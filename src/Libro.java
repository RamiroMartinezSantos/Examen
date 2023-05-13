public class Libro {
    String nombre;
    String codigo;
    String titulo;
    String autor;
    int ejemplares;

    public Libro(String nombre,String codigo, String titulo, String autor, int ejemplares){
        this.nombre = nombre;
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
    }

    @Override

    public String toString(){
        return nombre + "nombre" + codigo + "codigo" + titulo + "titulo" + ejemplares + "ejemplares";
    }

}

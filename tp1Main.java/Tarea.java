package tp1;

public class Tarea {
    private String titulo;
    private String descripcion;
    private boolean completada;

    public Tarea(String titulo, String descripcion){
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.completada = false;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public boolean isCompletada(){
        return completada;
    }

    public void setCompletada(boolean completada){
        this.completada = completada;
    }

    public void mostrar(){
        if (completada)
            System.out.println("[X] " + titulo);
        else
            System.out.println("[ ] " + titulo);

        System.out.println("    Descripción: " + descripcion);
    }
}
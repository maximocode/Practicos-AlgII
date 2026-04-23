/*import tp2.Persona;*/

public class Estudiante extends Persona{
    private String carrera;
    private float promedio;
    private String materias;

    public Estudiante(){
        super();
    }
    public Estudiante(String apellido, String nombre, int edad, String documento, String carrera, float promedio, String materias){
        super(apellido, nombre, edad, documento);
        this.carrera=carrera;
        this.promedio=promedio;
        this.materias=materias;
    }
    public String getCarrera(){
        return carrera;
    }
    public void setCarrera(String carrera){
        this.carrera=carrera;
    }
    public Float getPromedio(){
        return promedio;
    }
    public void setPromedio(float promedio){
        this.promedio=promedio;
    }
    public String getMaterias(){
        return materias;
    }
    public void setMaterias(String materias){
        this.materias=materias;
    }
    public String toString(){
        return super.toString()+", Carrera: "+carrera+", Promedio: "+promedio+", Materias: "+materias;
    }
    public void equals(Estudiante estudiante){
        if(this.getDocumento().equals(estudiante.getDocumento())){
            System.out.println("Los estudiantes son iguales");
        }else{
            System.out.println("Los estudiantes son diferentes");
        }
    }
    public void hashCode(Estudiante estudiante){
        System.out.println("El hash code del estudiante es: "+estudiante.getDocumento().hashCode());
    }
}

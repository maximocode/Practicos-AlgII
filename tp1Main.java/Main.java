package tp1;

public class Main {
    public static void main(String[] args){

        ListaDeTareas lista = new ListaDeTareas();

        Tarea t1 = new Tarea("Comprar pan", "Ir a la panadería del centro");
        Tarea t2 = new Tarea("Estudiar Java", "Repasar clases y objetos");
        Tarea t3 = new Tarea("Hacer ejercicio", "Salir a caminar 30 minutos");

        lista.agregarTarea(t1);
        lista.agregarTarea(t2);
        lista.agregarTarea(t3);

        System.out.println("Lista original");
        lista.mostrarTodas();

        lista.marcarComoCompletada(1);

        System.out.println("Lista actualizada");
        lista.mostrarTodas();
    }
}
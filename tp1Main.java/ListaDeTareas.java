package tp1;

public class ListaDeTareas {

    private Tarea[] tareas;
    private int contador;
    private int limite;

    public ListaDeTareas() {
        limite = 10;
        tareas = new Tarea[limite];
        contador = 0;
    }

    public void agregarTarea(Tarea t) {
        if (contador < limite) {
            tareas[contador] = t;
            contador++;
        } else {
            System.out.println("Lista llena");
        }
    }

    public void marcarComoCompletada(int indice) {
        if (indice >= 0 && indice < contador) {
            tareas[indice].setCompletada(true);
        } else {
            System.out.println("Índice inválido");
        }
    }

    public void mostrarTodas() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Tarea #" + i);
            tareas[i].mostrar();
            System.out.println();
        }
    }
}
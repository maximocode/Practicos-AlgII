public class tutorial {

    private String marca;
    private int velocidad;
    private char color;

    //constructor
    public tutorial(String marca, int velocidad, char color){
        this.marca=marca;
        this.velocidad=velocidad;
        this.color=color;
    }

    public String getMarca(){
        return marca;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public char getColor(){
        return color;
    }

    public char setColor(){
        return color;
    }
    public String setMarca(){
        return marca;
    }
    public int setVelocidad(){
        return velocidad;
    }


}


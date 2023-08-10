public class Main {
    public static void main(String[] args) {



    }
}


class Vehiculo {

    int velocidadMaxima;

    public Vehiculo(){
        System.out.println("Soy el constructor");
    }
}

class Motor {
    String tipoMotor;
    Motor(){
        System.out.println("Soy el constructor de motor");
    }

}




class Coche extends  Vehiculo, Motor{

}
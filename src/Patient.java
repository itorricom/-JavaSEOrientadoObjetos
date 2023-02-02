public class Patient {
    //Atributos
    String name;
    String email;
    String address;
    String phoneNumber;
    String birthday;
    double weight;
    double height;
    String blood;

    //Constructor
    Patient(){} //vacio
    Patient(String _name, String _email) { //con parametros
        this.name = _name;
        this.email = _email;
    }

    public void saludo(){
        System.out.println("Hola soy la clase Patient");
    }

}

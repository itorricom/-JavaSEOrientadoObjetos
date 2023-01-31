public class Doctor {
    //Atributos
   static int id;  //
    String name;
    String speciality;

    //Constructor
    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor(String name){
        System.out.println("El nombre del doctor asignado es: " + name);
    }

    //Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void  showId(){
        System.out.println("ID Doctor: " + id);
    }
}

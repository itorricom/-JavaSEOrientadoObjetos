import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Isidoro Torrico","Pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Isidoro Torrico","itorrico@gmail.com");
        System.out.println(patient.name);
        System.out.println(patient.email);
    }
}
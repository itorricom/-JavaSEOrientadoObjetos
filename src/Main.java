import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //Doctor myDoctor = new Doctor();
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Isidoro Torrico";
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctor1 = new Doctor();
        myDoctor1.showId();

        showMenu();

    }
}
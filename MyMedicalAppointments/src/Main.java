import model.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Anahi", "ana@ana.com");
        user.showDataUser();

        User userPa = new Patient("Anahi", "ana@ana.com");
        userPa.showDataUser();

        User user1 = new User("Anahi", "ana@ana.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor\n");
                System.out.println("Hospital: Cruz Verde");
                System.out.println("Departamento: Geriatría");
            }
        };

        user1.showDataUser();

        ISchedulable iSchedulable = new ISchedulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };



        /*

        for (model.Doctor.AvailableAppointment aA: myDoctor.getAvailableAppointments()) {
            System.out.println(aA.getDate() + " " + aA.getTime());
        }
        */

        /*
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);*/

    }



}

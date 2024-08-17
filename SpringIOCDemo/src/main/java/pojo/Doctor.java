package pojo;

import javax.print.Doc;
import java.util.ArrayList;

public class Doctor {

    ArrayList<String> patients;

    Doctor(ArrayList<String> patients) {
        this.patients = patients;
    }

    public void printPatientNames() {
        for (String p : patients)
            System.out.println("Patient Name:" + p);
    }
}

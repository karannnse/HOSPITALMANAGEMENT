import java.util.ArrayList;

class Patient {
    String name;
    int age;
    String contact;

    public Patient(String name, int age, String contact) {
        this.name = name;
        this.age = age;
        this.contact = contact;
    }
}

class Doctor {
    String name;
    String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
}

class Hospital {
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayPatients() {
        for (Patient patient : patients) {
            System.out.println("Patient: " + patient.name + ", Age: " + patient.age + ", Contact: " + patient.contact);
        }
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors) {
            System.out.println("Doctor: " + doctor.name + ", Specialization: " + doctor.specialization);
        }
    }
}

public class Appointmentapp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

       
        Doctor doctor1 = new Doctor("Dr. xyz", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. abc", "Orthopedic");
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        
        Patient patient1 = new Patient("karan", 35, "123-456-7890");
        Patient patient2 = new Patient("krishna", 45, "987-654-3210");
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        
        System.out.println("Patients:");
        hospital.displayPatients();

        System.out.println("\nDoctors:");
        hospital.displayDoctors();
    }
}



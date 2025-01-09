import java.util.*;
public class App {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Patient> patients = new ArrayList<>();
    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nHospital Management System");
            System.out.println("1. Patient Management");
            System.out.println("2. Doctor Management");
            System.out.println("3. Appointment Scheduling");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    patientManagement();
                    break;
                case 2:
                    doctorManagement();
                    break;
                case 3:
                    appointmentScheduling();
                    break;
                case 4:
                    System.out.println("Thank you for using HMS. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void patientManagement() {
        while (true) {
            System.out.println("\nPatient Management");
            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addPatient();
                    break;
                case 2:
                    viewPatients();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addPatient() {
        System.out.print("Enter patient name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patient age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter patient gender: ");
        String gender = scanner.nextLine();

        Patient patient = new Patient(name, age, gender);
        patients.add(patient);
        System.out.println("Patient added successfully.");
    }

    private static void viewPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered.");
            return;
        }

        System.out.println("\nPatient List:");
        for (int i = 0; i < patients.size(); i++) {
            System.out.println((i + 1) + ". " + patients.get(i));
        }
    }

    private static void doctorManagement() {
        while (true) {
            System.out.println("\nDoctor Management");
            System.out.println("1. Add Doctor");
            System.out.println("2. View Doctors");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addDoctor();
                    break;
                case 2:
                    viewDoctors();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addDoctor() {
        System.out.print("Enter doctor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter doctor specialization: ");
        String specialization = scanner.nextLine();

        Doctor doctor = new Doctor(name, specialization);
        doctors.add(doctor);
        System.out.println("Doctor added successfully.");
    }

    private static void viewDoctors() {
        if (doctors.isEmpty()) {
            System.out.println("No doctors registered.");
            return;
        }

        System.out.println("\nDoctor List:");
        for (int i = 0; i < doctors.size(); i++) {
            System.out.println((i + 1) + ". " + doctors.get(i));
        }
    }

    private static void appointmentScheduling() {
        while (true) {
            System.out.println("\nAppointment Scheduling");
            System.out.println("1. Schedule Appointment");
            System.out.println("2. View Appointments");
            System.out.println("3. Back to Main Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    scheduleAppointment();
                    break;
                case 2:
                    viewAppointments();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void scheduleAppointment() {
        if (patients.isEmpty() || doctors.isEmpty()) {
            System.out.println("Cannot schedule appointment. Ensure there are patients and doctors registered.");
            return;
        }

        viewPatients();
        System.out.print("Select patient (enter number): ");
        int patientIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        viewDoctors();
        System.out.print("Select doctor (enter number): ");
        int doctorIndex = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline

        System.out.print("Enter appointment date (DD/MM/YYYY): ");
        String date = scanner.nextLine();

        // Add time slot selection
        System.out.println("Available time slots:");
        System.out.println("1. 09:00 AM - 10:00 AM");
        System.out.println("2. 10:00 AM - 11:00 AM");
        System.out.println("3. 11:00 AM - 12:00 PM");
        System.out.println("4. 02:00 PM - 03:00 PM");
        System.out.println("5. 03:00 PM - 04:00 PM");
        System.out.print("Select time slot (enter number): ");
        int timeSlotChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String timeSlot;
        switch (timeSlotChoice) {
            case 1:
                timeSlot = "09:00 AM - 10:00 AM";
                break;
            case 2:
                timeSlot = "10:00 AM - 11:00 AM";
                break;
            case 3:
                timeSlot = "11:00 AM - 12:00 PM";
                break;
            case 4:
                timeSlot = "02:00 PM - 03:00 PM";
                break;
            case 5:
                timeSlot = "03:00 PM - 04:00 PM";
                break;
            default:
                System.out.println("Invalid time slot choice. Appointment not scheduled.");
                return;
        }


        Appointment appointment = new Appointment(patients.get(patientIndex), doctors.get(doctorIndex), date, timeSlot);
        appointments.add(appointment);
        System.out.println("Appointment scheduled successfully.");
    }


    private static void viewAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments scheduled.");
            return;
        }

        System.out.println("\nAppointment List:");
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println((i + 1) + ". " + appointments.get(i));
        }
    }
}

class Patient {
    private String name;
    private int age;
    private String gender;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Gender: " + gender + ")";
    }
}

class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    @Override
    public String toString() {
        return name + " (Specialization: " + specialization + ")";
    }
}

class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String timeSlot;

    public Appointment(Patient patient, Doctor doctor, String date, String timeSlot) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.timeSlot = timeSlot;
    }

    @Override
    public String toString() {
        return "Patient: " + patient + ", Doctor: " + doctor + ", Date: " + date + ", Time: " + timeSlot;
    }
}



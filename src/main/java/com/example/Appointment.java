package com.example;

public class Appointment {
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

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getDate() {
        return date;
    }

    public String getTimeSlot() {
        return timeSlot;
    }
    @Override
    public String toString() {
        return "Appointment: " + patient + " with " + doctor + " on " + date + " at " + timeSlot;
    }
}

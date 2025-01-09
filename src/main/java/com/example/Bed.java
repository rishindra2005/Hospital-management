package com.example;

public class Bed {
    private int bedNumber;
    private boolean isOccupied;
    private String occupiedDate;
    private Patient patient;

    public Bed(int bedNumber) {
        this.bedNumber = bedNumber;
        this.isOccupied = false;
    }

    // Getters and setters
    public int getBedNumber() { return bedNumber; }
    public boolean isOccupied() { return isOccupied; }
    public String getOccupiedDate() { return occupiedDate; }
    public Patient getPatient() { return patient; }

    public void occupy(Patient patient, String date) {
        this.isOccupied = true;
        this.occupiedDate = date;
        this.patient = patient;
    }

    public void release() {
        this.isOccupied = false;
        this.occupiedDate = null;
        this.patient = null;
    }
}
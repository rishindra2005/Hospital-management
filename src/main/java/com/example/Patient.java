package com.example;

public class Patient {
    private String name;
    private int age;
    private String gender;
    private int daysOfStay;
    private int totalBill = 0;

    public Patient(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daysOfStay = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getDaysOfStay() {
        return daysOfStay;
    }

    public void setDaysOfStay(int daysOfStay) {
        this.daysOfStay = daysOfStay;
    }

    public void clearBill() {
        this.totalBill = 0;
        this.daysOfStay = 0;
    }

    public boolean hasPaidBill() {
        return this.totalBill == 0;
    }

    public void addToBill(int amount) {
        this.totalBill += amount;
    }

    public int getTotalBill() {
        return this.totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    @Override
    public String toString() {
        return name + " (" + age + ", " + gender + ")";
    }
}



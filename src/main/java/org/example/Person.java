package org.example;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;

    private LocalDate dob;
    private int sizeInCm;

    //region constructer
    public Person(String firstName, String lastName, LocalDate dob, int sizeInCm) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.sizeInCm = sizeInCm;
    }
    //endregion

    //region getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }
    //endregion
}

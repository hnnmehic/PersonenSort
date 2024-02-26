package org.example;

import java.time.LocalDate;

public class Person implements Comparable<Person>{
    private String firstName;
    private String lastName;

    private String dob;
    private int sizeInCm;

    //region constructer
    public Person(String firstName, String lastName, String dob, int sizeInCm) {
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

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getSizeInCm() {
        return sizeInCm;
    }

    public void setSizeInCm(int sizeInCm) {
        this.sizeInCm = sizeInCm;
    }


    //endregion

    @Override
    public int compareTo(Person o) {
        int lastNameCompariston = this.getLastName().compareTo(o.getLastName());
        if (lastNameCompariston != 0) {
            return lastNameCompariston;
        }
        return this.getFirstName().compareTo(o.getFirstName());
    }
}

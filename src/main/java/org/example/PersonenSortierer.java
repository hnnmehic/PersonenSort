package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PersonenSortierer{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> personList = new ArrayList<Person>();
        System.out.print("""
                1 ... Person eingeben
                2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben
                3 ... Liste nach Alter absteigend ausgeben
                4 ... Liste nach Größe aufsteigend ausgeben
                0 ... Programm beenden
                """);
        int eingabe = scanner.nextInt();

        do {


            if (eingabe == 1) {
                System.out.println("Vorname:");
                String name = scanner.next();
                System.out.println("Nachname:");
                String nachName = scanner.next();
                System.out.println("Geburtsdatum:");
                String dob = scanner.next();
                System.out.println("Größe in cm:");
                int sizeInCm = scanner.nextInt();
                personList.add(new Person(name,nachName,dob,sizeInCm));
            } else if (eingabe == 2) {
                Collections.sort(personList);
                for (Person person : personList) {
                    System.out.println(person.getFirstName()+","+person.getLastName());
                }
            }
            System.out.print("""
                1 ... Person eingeben
                2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben
                3 ... Liste nach Alter absteigend ausgeben
                4 ... Liste nach Größe aufsteigend ausgeben
                0 ... Programm beenden
                """);
            eingabe = scanner.nextInt();


        }while(eingabe!=0);

    }
}

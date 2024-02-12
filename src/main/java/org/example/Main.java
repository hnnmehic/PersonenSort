package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                1 ... Person eingeben
                2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben
                3 ... Liste nach Alter absteigend ausgeben
                4 ... Liste nach Größe aufsteigend ausgeben
                0 ... Programm beenden
                """);
        int eingabe = scanner.nextInt();

        do {
            System.out.print("""
                1 ... Person eingeben
                2 ... Liste nach Nachnamen / Vornamen sortiert ausgeben
                3 ... Liste nach Alter absteigend ausgeben
                4 ... Liste nach Größe aufsteigend ausgeben
                0 ... Programm beenden
                """);
              eingabe = scanner.nextInt();

            if (eingabe == 1) {
                System.out.println("Vorname:");
                String name = scanner.next();
                System.out.println("Nachname:");
                String nachName = scanner.next();
                System.out.println("Geburtsdatum:");
                String dob = scanner.next();
                System.out.println("Größe in cm:");
                int sizeInCm = scanner.nextInt();
            }



        }while(eingabe!=0);

    }
}
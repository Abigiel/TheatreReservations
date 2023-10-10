package com.pluralsight;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class TheatreReservations {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.print("Enter your full name: ");
        String fullName = myScanner.nextLine();
        String[] names= fullName.split(" ");

        System.out.print("Enter date of the show (MM/dd/yyyy): ");
        String showDate = myScanner.nextLine();

        LocalDate dateOfShow= LocalDate.parse(showDate, format);

        System.out.print("How many tickets would you like?");
        int ticketNum = myScanner.nextInt();

        String plural= "";

        if (ticketNum > 1){
            plural = "s";
        }

        String firstName= names[0];
        String lastName= names[1];

        System.out.println(ticketNum + " ticket" +plural+ " reserved for " + dateOfShow + " under "+ lastName +", " + firstName +".");
    }
}

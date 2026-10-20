package com.pluralsight;

//Import Scanner
import java.util.Scanner;

public class FullNameParserApp {

    public static void main(String[] args) {

        // Ask user to enter name // First,Last || First,Middle,Last
        Scanner theScanner = new Scanner(System.in);

        //Ask user to enter their name
        System.out.println("What Is Your Full Name?");
        String fullName = theScanner.nextLine().trim();

        //Split the fullname into separate parts based on the spaces
        String[] nameParts = fullName.split(" ");

        System.out.println("First Name:"+ " " + nameParts[0]);
        System.out.println("Middle Name:" + " " + nameParts[1]);
        System.out.println("Last Name:" + " " +nameParts[2]);





    }
}

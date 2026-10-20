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



    }
}

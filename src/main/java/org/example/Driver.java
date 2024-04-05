package org.example;

import java.util.Scanner;

public class Driver {
    // METHOD TO CREATE AN OUTFIT THROUGH APPLICATION
    private static Application configureApplication() {
System.out.println("Which Outfit would you like?");
        //initiailzes a new outfit application and an outfitfactory
        Application app;
        OutfitFactory factory;

        //asks for user input on what outfit they want
        Scanner scn = new Scanner(System.in);
        String printName = scn.nextLine();

        //Checks to see if they want a specific type of outfit, will repeat until they input a correct outfit type
        if (printName.contains("Casual")) {
            factory = new CasualFactory();
            app = new Application(factory);
            return app;
        } else if (printName.contains("Party")) {
            factory = new PartyFactory();
            app = new Application(factory);
            return app;
        } else if (printName.contains("Professional")) {
            factory = new ProfessionalFactory();
            app = new Application(factory);
            return app;
        } else {
            System.out.println("Please input whetehr you want a Casual, Party, or Professional outift.");
            return configureApplication;

        }
    }

    //main method creates an outift application from user input then prints the outfit details
    public static void main(String[] args) {
        Application app = configureApplication();
        app.revealContent();
    }

}


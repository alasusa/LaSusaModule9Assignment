package org.example;

import java.util.Scanner;

public class Driver {
    private static Application configureApplication() {

        Application app;
        OutfitFactory factory;
        Scanner scn = new Scanner(System.in);
        String printName = scn.nextLine();

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
            return null;

        }
    }

    public static void main(String[] args) {
        System.out.println("Which Outfit would you like?");
        Application app = configureApplication();
        app.revealContent();
    }

}


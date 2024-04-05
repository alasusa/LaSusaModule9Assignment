package org.example;

//CLASS TO ALLOW USER TO SPECIFY WHAT CLOTHES THEY WANT
public class Application {

    //Initializing the outfit
    private Pants pairOfPants ;
    private Tops Top;
    private Shoes pairOfShoes;

    // creates an outfit
    public Application(OutfitFactory factory) {
       pairOfPants = factory.createAPants();
       Top = factory.createATop();
       pairOfShoes = factory.createAShoes();
    }

    //shows outfit details
    public void revealContent(){
        pairOfPants.typeOfPants();
        Top.typeOfShirts();
        pairOfShoes.typeOfShoes();
    }


}


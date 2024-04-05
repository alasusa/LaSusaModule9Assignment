package org.example;

//CLASS TO ALLOW USER TO SPECIFY WHAT CLOTHES THEY WANT
public class Application {

    private Pants pairOfPants ;
    private Tops Top;
    private Shoes pairOfShoes;

    public Application(OutfitFactory factory) {
       pairOfPants = factory.createAPants();
       Top = factory.createATop();
       pairOfShoes = factory.createAShoes();
    }

    public void revealContent(){
        pairOfPants.typeOfPants();
        Top.typeOfShirts();
        pairOfShoes.typeOfShoes();
    }


}


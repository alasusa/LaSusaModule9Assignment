package org.example;

// FACTORY THAT WILL RETURN CASUAL CLOTHES OBJECTS
public class CasualFactory implements OutfitFactory{
    @Override
    public Pants createAPants() {
        return new CasualPants();
    }

    @Override
    public Tops createATop() {

        return new CasualTops();
    }

    @Override
    public Shoes createAShoes() {

        return new CasualShoes();
    }
}

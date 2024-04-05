package org.example;


// FACTORY THAT WILL RETURN PARTY CLOTHES OBJECTS
public class PartyFactory implements OutfitFactory{
    @Override
    public Pants createAPants() {
        return new PartyPants();
    }

    @Override
    public Tops createATop() {
        return new PartyTops();
    }

    @Override
    public Shoes createAShoes() {
        return new PartyShoes();
    }
}

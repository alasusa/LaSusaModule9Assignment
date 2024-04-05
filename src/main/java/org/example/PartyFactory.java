package org.example;

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

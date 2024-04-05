package org.example;

public class ProfessionalFactory implements  OutfitFactory{
    @Override
    public Pants createAPants() {
        return new ProfessionalPants();
    }

    @Override
    public Tops createATop() {
        return new ProfessionalTops();
    }

    @Override
    public Shoes createAShoes() {
        return new ProfessionalShoes();
    }
}

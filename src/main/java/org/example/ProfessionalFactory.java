package org.example;


// FACTORY THAT WILL RETURN PROFESSIONAL CLOTHES OBJECTS
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

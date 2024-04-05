package org.example;

//INTERFACE THAT OTHER FACTORY CLASSES WILL USE
public interface OutfitFactory {

    Pants createAPants();
    Tops createATop();
    Shoes createAShoes();
}

package br.com.acbueno.learning.desing.patterns.structural.flyweight.house;

public enum HouseTypeName {
    COUNTRY_HOUSE(1, "Country House"),
    COTTAGE(2, "Cottage"),
    APARTMENT(3, "Apartment"),
    SEMI_DETACHED_HOUSE(4, "semi-detached house"),
    COMMON_HOUSE(5, "Common House");

    private int id;
    private String name;

    private HouseTypeName(int id, String name) {
        this.id=id;
        this.name = name;
    }

}

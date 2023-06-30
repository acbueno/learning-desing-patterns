package br.com.acbueno.learning.desing.patterns.structural.flyweight.house;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {

    private static final Logger LOGGER = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {

        HouseType houseCountryType = HouseFactory.getHouseType(HouseTypeName.COUNTRY_HOUSE, "pink");
        House houseCountry = new House(10, 25, houseCountryType);
        houseCountry.build(HouseTypeName.COUNTRY_HOUSE, houseCountryType.getColor());

        HouseType cottage = HouseFactory.getHouseType(HouseTypeName.COTTAGE, "wood");
        House cottageHouse = new House(6, 26, cottage);
        cottageHouse.build(HouseTypeName.COTTAGE, cottage.getColor());
    }

}

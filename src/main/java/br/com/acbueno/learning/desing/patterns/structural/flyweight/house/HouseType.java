package br.com.acbueno.learning.desing.patterns.structural.flyweight.house;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HouseType {

    private static final Logger LOGGER = LoggerFactory.getLogger(HouseType.class);
    private HouseTypeName houseTypeName;
    private String color;

    public HouseType(HouseTypeName houseTypeName, String color) {
        this.houseTypeName = houseTypeName;
        this.color = color;
    }

    public void build(HouseTypeName houseTypeName, String color) {
        LOGGER.info(String.format("House Type: %s, color: %s", houseTypeName.name(), color));
    }

    public HouseTypeName getHouseTypeName() {
        return houseTypeName;
    }

    public String getColor() {
        return color;
    }

}

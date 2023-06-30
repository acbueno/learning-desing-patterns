package br.com.acbueno.learning.desing.patterns.structural.flyweight.house;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class House {

    private static final Logger LOGGER = LoggerFactory.getLogger(House.class);
    private int width;
    private int height;
    private HouseType houseType;
    private int squareMeter;

    public House(int width, int height, HouseType houseType) {
       this.width = width;
       this.height = height;
       this.houseType = houseType;
       this.squareMeter = width * height;
    }

    public void build(HouseTypeName houseTyName, String color) {
        int squareMeter = getSquareMeter();
        LOGGER.info(String.format("Square meter: %s", squareMeter));
        houseType.build(houseTyName, color);
    }



    public static Logger getLogger() {
        return LOGGER;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public int getSquareMeter() {
        return squareMeter;
    }

    @Override
    public String toString() {
        return "House [width=" + width + ", height=" + height + ", houseType=" + houseType + "]";
    }



}

package br.com.acbueno.learning.desing.patterns.structural.flyweight.house;

import java.util.HashMap;
import java.util.Map;

public class HouseFactory {

    private static Map<String, HouseType> houseTypeMap = new HashMap<>();

    public static HouseType getHouseType(HouseTypeName houseTypeName, String color) {
        HouseType result = houseTypeMap.get(houseTypeName.name());
        if (result == null) {
            result = new HouseType(houseTypeName, color);
            houseTypeMap.put(houseTypeName.name(), result);
        }
        return result;
    }

}

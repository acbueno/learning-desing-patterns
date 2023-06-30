package br.com.acbueno.learning.desing.patterns.structural.proxy.house;

public class ProxyBuild implements Build {

    private Build builder;
    private String buildType;


    public ProxyBuild(String buildType) {
       this.buildType = buildType;
    }

    @Override
    public void build() {
        if(buildType.equals(Dwelling.HOUSE.name())) {
            builder = new HouseBuild();
        } else {
            builder = new ApartmentBuild();
        }
        builder.build();
    }

}

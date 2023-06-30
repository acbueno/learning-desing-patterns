package br.com.acbueno.learning.desing.patterns.structural.facade.buildhouse;

public class BuildHouseFacade {

    private Landscaping landscaping = new Landscaping();
    private BuildMasonry buildMasonry = new BuildMasonry();
    private BuildlHydraulics buildlHydraulics = new BuildlHydraulics();
    private BuildElectric buildElectric = new BuildElectric();
    private BuildRoof buildRoof = new BuildRoof();

    public void build() {
        landscaping.build();
        buildMasonry.build();
        buildlHydraulics.build();
        buildElectric.build();
        buildRoof.build();
    }

}

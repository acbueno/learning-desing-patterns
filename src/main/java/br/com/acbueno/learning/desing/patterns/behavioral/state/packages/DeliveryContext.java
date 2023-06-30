package br.com.acbueno.learning.desing.patterns.behavioral.state.packages;

public class DeliveryContext {

    private PackageState currentState;
    private String packageId;

    public DeliveryContext(PackageState currentPackage, String packageId) {
        this.currentState = currentPackage;
        this.packageId = packageId;

        if(currentPackage == null) {
            this.currentState = Acknowledged.getInstance();
        }
    }

    public PackageState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(PackageState currentState) {
        this.currentState = currentState;
    }

    public String getPackageId() {
        return packageId;
    }

    public void setPackageId(String packageId) {
        this.packageId = packageId;
    }

    public void update() {
        currentState.updateState(this);
    }



}

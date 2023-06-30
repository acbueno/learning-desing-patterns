package br.com.acbueno.learning.desing.patterns.behavioral.state.carmanufacturing;

public class ManufacturingContext {

    private ManufacturingState currentManufacturingState;
    private String cardCode;

    public ManufacturingContext(ManufacturingState currentManufacturingState, String cardCode) {
        this.currentManufacturingState = currentManufacturingState;
        this.cardCode = cardCode;

        if (currentManufacturingState == null) {
            this.currentManufacturingState = PressShopState.getInstance();
        }
    }

    public ManufacturingState getManufacturingState() {
        return currentManufacturingState;
    }

    public void setManufacturingState(ManufacturingState manufacturingState) {
        this.currentManufacturingState = manufacturingState;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public void update() {
        this.currentManufacturingState.updateState(this);
    }

}

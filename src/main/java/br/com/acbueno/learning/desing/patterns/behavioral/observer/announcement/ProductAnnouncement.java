package br.com.acbueno.learning.desing.patterns.behavioral.observer.announcement;

public class ProductAnnouncement {

    private ProductType productType;
    private String name;
    private Double price;

    public ProductType getProductType() {
        return productType;
    }
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "ProductAnnouncement [productType=" + productType + ", name=" + name + ", price=" + price + "]";
    }

}

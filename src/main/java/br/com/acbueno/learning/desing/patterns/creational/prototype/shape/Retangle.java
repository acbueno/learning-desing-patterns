package br.com.acbueno.learning.desing.patterns.creational.prototype.shape;

public class Retangle extends Shape {

    public int width;
    public int height;

    public Retangle() {

    }

    public Retangle(Retangle target) {
        super(target);
        if(target !=null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Retangle(this);
    }

    public boolean equals(Object object2) {
        if(!(object2 instanceof Retangle) || !super.equals(object2)) {
            return false;
        }
        Retangle shape2 = (Retangle) object2;
        return shape2.width == width
                && shape2.height == height;
    }

}

package br.com.acbueno.learning.desing.patterns.structural.flyweight.pen;

public class PainBrushClient {

    public static void main(String[] args) {
        Pen yellowThinPen1 = PenFactory.getThinckPen("YELLOW");  //created new pen
        yellowThinPen1.draw("Hello World !!");

        Pen yellowThinPen2 = PenFactory.getThinckPen("YELLOW");  //pen is shared
        yellowThinPen2.draw("Hello World !!");

        Pen blueThinPen = PenFactory.getThinckPen("BLUE");
        blueThinPen.draw("Hello World !!");

        System.out.println(yellowThinPen1.hashCode());
        System.out.println(yellowThinPen2.hashCode());

        System.out.println(blueThinPen.hashCode());
    }

}

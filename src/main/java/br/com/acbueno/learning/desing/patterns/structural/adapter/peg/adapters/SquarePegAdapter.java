package br.com.acbueno.learning.desing.patterns.structural.adapter.peg.adapters;

import br.com.acbueno.learning.desing.patterns.structural.adapter.peg.RoundPeg;
import br.com.acbueno.learning.desing.patterns.structural.adapter.peg.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
       this.peg = peg;
    }

    public double getRadius() {
       return (Math.sqrt(Math.pow((peg.getWidth()/2), 2)* 2));
    }

}

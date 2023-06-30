package br.com.acbueno.learning.desing.patterns.structural.adapter.peg;

import br.com.acbueno.learning.desing.patterns.structural.adapter.peg.adapters.SquarePegAdapter;

public class Client {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);

        if(hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdpaer = new SquarePegAdapter(largeSqPeg);

        if(hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }

        if(!hole.fits(largeSqPegAdpaer)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }

}

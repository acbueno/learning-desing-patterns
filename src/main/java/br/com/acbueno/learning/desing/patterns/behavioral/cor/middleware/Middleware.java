package br.com.acbueno.learning.desing.patterns.behavioral.cor.middleware;

public abstract class Middleware {

    private Middleware next;

    public static Middleware link(Middleware first, Middleware ...chain) {
        Middleware head = first;
        for (Middleware nextInChain : chain) {
             head.next = nextInChain;
             head = nextInChain;
        }
        return first;
    }

    public abstract boolean check(String email, String password);

    public boolean checkNext(String email, String passord) {
        if(next == null) {
            return true;
        }
        return next.check(email, passord);
    }

}

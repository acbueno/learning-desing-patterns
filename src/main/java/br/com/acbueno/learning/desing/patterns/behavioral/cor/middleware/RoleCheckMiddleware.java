package br.com.acbueno.learning.desing.patterns.behavioral.cor.middleware;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if(email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }

}

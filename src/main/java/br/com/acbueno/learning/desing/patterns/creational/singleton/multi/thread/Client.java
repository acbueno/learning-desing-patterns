package br.com.acbueno.learning.desing.patterns.creational.singleton.multi.thread;

import br.com.acbueno.learning.desing.patterns.creational.builder.car.builder.product.Car;

public class Client {

    public static void main(String[] args) {
        System.out.println("Se os valores forem iguais seu singleton funcionou" + "\n" +
                "Se valores são diferentes ele criou outra instancia" + "\n\n" +
                "RESULTADOS:" + "\n");

        Thread threadOne = new Thread(new ThredOne());
        Thread threaTwo = new Thread(new ThreadTwo());
        threadOne.start();
        threaTwo.start();
    }


    static class ThredOne implements Runnable {
        @Override
        public void run() {
            CarSingleton singleton  = CarSingleton.getInstance("Versa");
            System.out.println(singleton.getCarModel());
        }
    }

    static class ThreadTwo implements Runnable {
        @Override
        public void run() {
            CarSingleton singleton = CarSingleton.getInstance("Nivus");
            System.out.println(singleton.getCarModel());

        }

    }

}

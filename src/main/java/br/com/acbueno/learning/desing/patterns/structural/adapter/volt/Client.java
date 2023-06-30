package br.com.acbueno.learning.desing.patterns.structural.adapter.volt;

public class Client {

    public static void main(String[] args) {
        testObjectAdpater();
        testClassAdpater();
    }

    private static void testClassAdpater() {
        SocketAdapter socketAdapter = new SocketClassAdpaterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt120 = getVolt(socketAdapter, 120);

        System.out.println(String.format("volt 3 Object Class: %s", volt3.getVolt()));
        System.out.println(String.format("volt 12 Object Class: %s", volt12.getVolt()));
        System.out.println(String.format("volt 120 Object Class: %s", volt120.getVolt()));
    }

    private static void testObjectAdpater() {
        SocketAdapter socketAdapter = new SocketObjectAdpaterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt120 = getVolt(socketAdapter, 120);

        System.out.println(String.format("volt 3 Object Adapter: %s", volt3.getVolt()));
        System.out.println(String.format("volt 12 Object Adpater: %s", volt12.getVolt()));
        System.out.println(String.format("volt 120 Object Adpater: %s", volt120.getVolt()));
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int value) {
        switch (value) {
        case 3:
            return socketAdapter.get3Volt();
        case 12:
            return socketAdapter.get12Volt();
        case 120:
            return socketAdapter.get120Volt();
        default:
            return socketAdapter.get120Volt();
        }
    }

}

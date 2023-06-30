package br.com.acbueno.learning.desing.patterns.structural.decorator.encode;

public interface DataSource {

    void writeData(String data);

    String readData();

}

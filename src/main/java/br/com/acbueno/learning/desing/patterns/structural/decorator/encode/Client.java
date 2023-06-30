package br.com.acbueno.learning.desing.patterns.structural.decorator.encode;

public class Client {

    public static void main(String[] args) {
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
        //@formatter:off
        DataSourceDecorator encoded = new CompressionDecorator(
                new EncryptionDecorator(
                        new FileDataSource("out/OutputDemo.txt")));
        //@formatter:on

        encoded.writeData(salaryRecords);
        DataSource plain = new FileDataSource("out/OutputDemo.txt");
        System.out.println("------ Input ---------");
        System.out.println(salaryRecords);
        System.out.println("------ Encoded -------");
        System.out.println(plain.readData());
        System.out.println("------ Decoded -------");
        System.out.println(encoded.readData());
    }

}

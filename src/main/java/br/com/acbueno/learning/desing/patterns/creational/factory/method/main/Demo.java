package br.com.acbueno.learning.desing.patterns.creational.factory.method.main;

import br.com.acbueno.learning.desing.patterns.creational.factory.method.factory.Dialog;
import br.com.acbueno.learning.desing.patterns.creational.factory.method.factory.HtmlDialog;
import br.com.acbueno.learning.desing.patterns.creational.factory.method.factory.WindowsDialog;

public class Demo {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        System.out.println(System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Linux")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

}

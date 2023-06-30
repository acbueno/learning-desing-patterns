package br.com.acbueno.learning.desing.patterns.behavioral.cor.maintence;

public abstract class MaintenceAbstractHandler implements MainteceHandler {

    private MainteceHandler nextHandler;

    @Override
    public void setNextHandler(MainteceHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void processRequest(String request) {
       boolean match = false;

       if(request != null && requestOperation().equals(request)) {
           match = true;
       } else {
           match = false;
       }

       if(match) {
           handlerRequest(request);
       } else {
           nextHandler.processRequest(request);
       }
    }

    protected abstract String requestOperation();

    protected abstract void handlerRequest(String request);

}

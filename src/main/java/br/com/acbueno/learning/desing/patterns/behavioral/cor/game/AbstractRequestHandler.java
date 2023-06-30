package br.com.acbueno.learning.desing.patterns.behavioral.cor.game;

public abstract class AbstractRequestHandler implements RequestHandler {

    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler handler) {
        this.nextHandler = handler;

    }

    @Override
    public void processRequest(String request) {
        boolean match = false;

        if (wordList().length == 0) {
            match = true;
        } else {
            for (String word : wordList()) {
                if (request.indexOf(word) >= 0) {
                    match = true;
                    break;
                }
            }
        }

        if (match) {
            handleRequest(request);
        } else {
            nextHandler.processRequest(request);
        }
    }

    protected abstract String[] wordList();
//
    protected abstract void handleRequest(String request);

}

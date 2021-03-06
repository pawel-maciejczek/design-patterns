package pl.designpatterns.behavioural.chainofresponsibility;

public class OrdinaryRequestHandler implements RequestHandler {

    private final RequestHandler nextHandler;

    public OrdinaryRequestHandler(RequestHandler requestHandler) {
        this.nextHandler = requestHandler;
    }

    @Override
    public void handleRequest(Request request) {
        System.out.printf("I am %s instance, and I have just handled normal request: %s", getClass().getSimpleName(), request);
        System.out.println();
    }
}

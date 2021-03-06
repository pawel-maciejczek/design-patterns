package pl.designpatterns.behavioural.visitor;

public class ComputerGame implements VisitedObject {
    private final String name;

    public ComputerGame(String name) {
        this.name = name;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

}

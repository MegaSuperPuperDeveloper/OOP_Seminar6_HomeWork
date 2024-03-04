package Task5;

// 5) Переписать код в соответствии с Dependency Inversion Principle:
public class Car1 {
    private iEngine engine;

    public Car1(iEngine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }


}

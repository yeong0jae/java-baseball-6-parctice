package baseball;

public class Application {
    public static void main(String[] args) {
        Output output = new Output();
        output.printStartMessage();

        BaseBall baseBall = new BaseBall();
        baseBall.start(output);
    }
}

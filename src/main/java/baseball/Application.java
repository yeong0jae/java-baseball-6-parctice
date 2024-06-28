package baseball;

public class Application {
    public static void main(String[] args) {
        Output.printStartMessage();

        BaseBall baseBall = new BaseBall();
        baseBall.start();
    }
}

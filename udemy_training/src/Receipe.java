public class Receipe extends AbstractReceipe{

    @Override
    void getReady() {
        System.out.println("Get the raw materials");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("Clean up the dish");
    }
}

public class MarioGame implements GamingConsole{


    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Goes down");
    }

    @Override
    public void left() {
        System.out.println("Moves left");
    }

    @Override
    public void right() {
        System.out.println("Moves right");
    }
}

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(150);
        MotorBike suzuki = new MotorBike();

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());
        System.out.println(suzuki.getSpeed());

        ducati.start();
        honda.start();

        ducati.setSpeed(80);
        honda.setSpeed(60);

        ducati.increaseSpeed(100);
        honda.increaseSpeed(100);

        ducati.decreaseSpeed(50);
        honda.decreaseSpeed(50);

        System.out.println(ducati.getSpeed());
        System.out.println(honda.getSpeed());

    }
}

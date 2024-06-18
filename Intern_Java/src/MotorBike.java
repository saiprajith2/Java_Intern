public class MotorBike {
    private int speed;

    public MotorBike(){
        this(5);
    }

    public MotorBike(int speed){
        this.speed=speed;
    }

    public void setSpeed(int speed){
        if(speed>0) {
            this.speed = speed;
        }
    }
    public int getSpeed(){
        return this.speed;
    }
    public void increaseSpeed(int howMuch){
        setSpeed(this.speed+howMuch);//for validation check positive values
    }
    public void decreaseSpeed(int howMuch){
        setSpeed(this.speed-howMuch);
    }

    void start(){
        System.out.println("Started");
    }
}

public class ReturnMethod {
    static int thirdAngle(int angle1,int angle2){
        int angle3=180-angle1-angle2;
        return  angle3;
    }
    public static void main(String[] args) {
        int angle33=thirdAngle(100,40);
        System.out.println(angle33);
    }
}

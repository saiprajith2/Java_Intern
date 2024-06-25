import java.util.Arrays;

enum Season{
    SUMMER(1),SPRING(4),WINTER(2),FALL(3);
    //0,1,2,3- Ordinals(Positions)

    private int value;
    private Season(int value){
        this.value=value;
    }

    public int getValue() {
        return value;
    }
}
public class EnumRunner {
    public static void main(String[] args) {
        Season season=Season.FALL;

        Season season1=Season.valueOf("WINTER");
        System.out.println(season1);
        System.out.println(Season.SPRING.ordinal());
        System.out.println(Season.SPRING.getValue());

        System.out.println(Arrays.toString(Season.values()));
    }
}

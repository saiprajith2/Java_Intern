import java.util.Arrays;

public class CompareArraysEqual_one {
    public static void main(String[] args) {
        int[] arr1={1,3,4,2,5};
        int[] arr2={5,4,2,1,5};
        if(isArraysEqual(arr1,arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }

    private static boolean isArraysEqual(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}

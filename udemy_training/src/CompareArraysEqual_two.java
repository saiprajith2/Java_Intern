import java.util.HashMap;

public class CompareArraysEqual_two {
    public static void main(String[] args) {
        int[] arr1={1,3,4,2,5};
        int[] arr2={5,4,2,1,3};
        if(arraysEqualCheck(arr1,arr2)){
            System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are not equal");
        }
    }

    private static boolean arraysEqualCheck(int[] arr1, int[] arr2) {
        if(arr1.length!=arr2.length){
            return false;
        }
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int arr:arr1){
            map.put(arr,map.getOrDefault(arr,0)+1);
        }

        for(int num:arr2){
            if(!map.containsKey(num)){
                return  false;
            }
            map.put(num,map.get(num)-1);
            if(map.get(num)==0){
                map.remove(num);
            }
        }
        return map.isEmpty();
    }
}

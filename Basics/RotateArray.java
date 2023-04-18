import java.util.Arrays;

public class RotateArray {
    public static void rotateOperation(int[] arr, int k) {
        //if k > array length, then modulo gives you the minimum rotation that will
        //resemble k times rotation. Don't know how mathematically it works
        k = k% arr.length;
        int i = arr.length - k - 1;

        rotate(arr, 0, i);
        System.out.println(Arrays.toString(arr));

        rotate(arr, i+1, arr.length-1);
        System.out.println(Arrays.toString(arr));

        rotate(arr, 0, arr.length-1);
    }
    
    public static void rotate(int[] s, int i, int j){
        while(i<j){
            int temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }
    }  
    public static void main(String[] args) {

        //Rotate single dimensional array
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        rotateOperation(arr, k);
        System.out.println(Arrays.toString(arr));
    }
    
}

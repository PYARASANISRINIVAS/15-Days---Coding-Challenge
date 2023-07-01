import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args){
        int arr[]=new int[3];         //Declaraiton of the array with the size
        arr[0]=3;
        arr[1]=2;
        arr[2]=1;
        System.out.println(arr.length);         //in build function for finding the length of the array
        for(int x:arr){                            
            System.out.print(x+" ");            //printing the array elements using the for-each loop
        }                                        
        Arrays.sort(arr);               //sorting the elements of the array
        //elements after sorting
        System.out.println();
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}

import java.util.*;
class LinearSearch{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int temp=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
           if(arr[i]==key){
                System.out.println("Element found");
                temp=1;
                break;
           }
        }
        if(temp==0){
            System.out.println("Element not found");
        }
        
    }
}
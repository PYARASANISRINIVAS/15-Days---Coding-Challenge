problem link:- https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-print-unique-elements-of-array

Solution 1:-
Language:- JAVA
Description:- Itetrating over the array twice and finding the unique values by using one extra variable called "temp".

CODE:-

import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Arr_Size=sc.nextInt();
        int Arr_Elements[]= new int[Arr_Size];
        for(int i=0;i<Arr_Size;i++){
            Arr_Elements[i]=sc.nextInt();
        }
        for(int i=0;i<Arr_Size;i++){
            int temp=0;
            for(int j=0;j<Arr_Size;j++){
                if(Arr_Elements[i]==Arr_Elements[j] && i!=j)
                    temp=1;
            }
            if(temp==0)
                System.out.print(Arr_Elements[i]+" ");
        }
    }
}

Complexity:-O(N),O(1)

-----------------------------------------------------------------------------------------------------

Solution 2:-
Language:- JAVA
Description:-"Using the frequency count(equal to "1" ) of the every element with the help of the HashMap" 

CODE:- 

public class Solution {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int Arr_Size=sc.nextInt();
        int Arr_Elements[]= new int[Arr_Size];
        for(int i=0;i<Arr_Size;i++){
            Arr_Elements[i]=sc.nextInt();
        }
        for(int i=0;i<Arr_Size;i++){
            if(!map.containsKey(Arr_Elements[i]))
                map.put(Arr_Elements[i],1);
            else{
                int temp=map.get(Arr_Elements[i]);
                temp++;
                map.put(Arr_Elements[i],temp);
            }       
        }

        for(int i=0;i<Arr_Size;i++){
            if(map.get(Arr_Elements[i])==1){
                System.out.print(Arr_Elements[i]+" ");
            }       
        }    
    }
}

Complexity:- 
N(insertion in HashMap) + N(Checking count ==1) , N(Extra space for thr HashMap) == O(N),O(N)
                
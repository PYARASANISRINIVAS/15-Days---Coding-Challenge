problem link:-https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-sum-of-odd-elements/copy-from/1359973105


Solution :- 1
Language :- JAVA
Description :- finding the element is not even and adding to sum

Code:-  

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if((arr[i]%2)!=0)
                sum+=arr[i];
        }
        System.out.println(sum);
        
    }
}

Complexity :- O(N),O(1)

-------------------------------------------------------------------------------------------------------

Solution :- 2
Language :- JAVA
Description :- "With out using the array" directly checking the value if odd added to the sum

Code :-

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            int x=sc.nextInt();

            if((x%2)!=0)
                sum+=x;    
        }
        System.out.println(sum);    
    }
}

-----------------------------------------------------------------------------------------------------

Solution :- 3
Language :- JAVA
Description :- "With out using the array" directly checking the value if odd(Bitwise Operator) added to the sum

Code:- 

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int sum=0;
        for(int i=0;i<size;i++){
            int x=sc.nextInt();

            if((x&1)==1)
                sum+=x;    
        }
        System.out.println(sum);    
    }
}


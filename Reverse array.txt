Problem link:- https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-reverse-array

Solution :- 1
Language :- JAVA
Description :- Just printing in the reverse order

Code:-

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Long Elements[]=new Long[size];
        for(int i=0;i<size;i++){
            Elements[i]=sc.nextLong();
        }
        for(int i=0;i<size;i++){
            System.out.print(Elements[size-1-i]+" ");
        }
    }
}

Complexity :- O(N * N) ,O(1)

------------------------------------------------------------------------------------------------------

Solution :- 2
Language :- JAVA
Description :- Using the "two pointer technique" and swaping the last and the first elements till the middle.

Code :- 

public class Solution {
    public static void reverseArray(Long[] Elements,int size){
        int p1=0,p2=size-1;
        while(p1<p2){
            long temp=Elements[p1];
            Elements[p1]=Elements[p2];
            Elements[p2]=temp;
            p1++;
            p2--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        Long Elements[]=new Long[size];
        for(int i=0;i<size;i++){
            Elements[i]=sc.nextLong();
        }
        reverseArray(Elements,size);
        for(int i=0;i<size;i++){
            System.out.print(Elements[i]+" ");
        }
    }
}

Complexity:- O(N),O(1)

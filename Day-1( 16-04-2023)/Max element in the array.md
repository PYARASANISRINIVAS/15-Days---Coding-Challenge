
problem link:-https://www.hackerrank.com/contests/smart-interviews-basic/challenges/si-basic-max-element

Solution 1:-  
Language:- Java  
Description:- "using sorting".

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n-1]);
        
    }
}

Complexity:- O(NlogN),O(1)

--------------------------------------------------------------------------------------------

Solution 2:- 
language:- Java 
Description:- "Iterating over the array just by comparing with the max"

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max_value=arr[0];
        for(int i=0;i<n;i++){
            max_value=Math.max(max_value,arr[i]);
        }      
        System.out.println(max_value);
        
    }
}

complexity:- O(N),O(1)

-------------------------------------------------------------------------------------------------------

Solution 3:- 
Java:- C  
Description:- "Iterating over the array just by comparing with the max"

int main() {
    int a[100],i,n,max;
    scanf("%d",&n);
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    max=a[0];
    for(i=0;i<n;i++){
        if(max<a[i]){
            max=a[i];
        }
    }
    printf("%d",max);
    return 0;
}

Complexity:-O(N),O(1)

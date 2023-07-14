import java.util.*;
public class ReverseNumber {
    static int m=1000000007;
    public static long reverse(long a) {
        if(a==0) return 0;
        Stack<Integer> q=new Stack<>();
        for(int i=0;i<31;i++){
            if((a&1)==1){
                q.push(1);
            }
            else{
                q.push(0);
            }
            a=a>>1;
        }
        
        long ans=1;
        long count=1;
        while(q.size()>0){
            // System.out.println(q.pop());
            if(q.pop()==1){
                ans=((ans)%m*(count)%m)%m;
                // System.out.println(count);
            }
            count=((count)%m*2)%m;
            // System.out.println(ans);
        }
        
        return ans;
    }
    
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        sc.close();
        System.out.println((reverse(t))%m);

    }
}

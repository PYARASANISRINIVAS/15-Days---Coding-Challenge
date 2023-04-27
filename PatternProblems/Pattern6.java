/*        
    op:      FLOYD'S TRIANGLE         
                1
                2 3
                4 5 6 
                7 8 9 10
                11 12 13 14 15                     n==5 
                      
 */

  //   Code:-

 
public class Pattern6{
    public static void main(String[] args){
        int row=5;
        int col=5;
        int count=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(j<=i)
                    System.out.print((count++)+" ");
                
            }
            System.out.println();
        }
    }
}
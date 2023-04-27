/*        
    op:               
                1
                2 2
                3 3 3 
                4 4 4 4
                5 5 5 5 5                     n==5 
                      
 */

  //   Code:-

 
public class Pattern5{
    public static void main(String[] args){
        int row=5;
        int col=5;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i>=j)
                    System.out.print(i+1+" ");
                
            }
            System.out.println();
        }
    }
}
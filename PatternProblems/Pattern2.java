/*        
    op:         * * * * 
                *     * 
                *     * 
                *     * 
                * * * * 
                      
 */


  //   Code:-
 
public class Pattern2{
    public static void main(String[] args){
        int row=5;
        int col=4;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i==0||i==4||j==0||j==3)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
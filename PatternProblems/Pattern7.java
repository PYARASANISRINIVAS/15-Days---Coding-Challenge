/*        
    op:                       n==4
                    *             *  
                    * *         * *      
                    * * *     * * *
                    * * * * * * * *
                    * * * * * * * *
                    * * *     * * * 
                    * *         * *
                    *             * 

                      
 */


  //   Code:-
 
public class Pattern7{
    public static void main(String[] args){
        int row=4;
        int col=4;
        for(int i=1;i<=(2*row);i++){
            for(int j=1;j<=(2*col);j++){
                if((i<=row)&&((j<=i)||(i+j)>2*row)){
                    System.out.print("* ");
                }
                else if((i>row)&&((i+j<=2*row+1)||j>=i)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
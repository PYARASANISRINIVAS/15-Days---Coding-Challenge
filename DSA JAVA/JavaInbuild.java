import java.util.*;
public class JavaInbuild{
    public static void main(String[] args){

        //Acessing the ranges of the Integer
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        


        //inbuild min and the max values
        int a=10,b=20;
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));

        //Managing the float precision
        float val1=2f; //
        System.out.println(val1);
        System.out.printf("%.2f",val1);
            //controlling the precision using the string fromat
        String format=String.format("%4f",val1);
        System.out.println(format);

        System.out.println();
        //Managing the double precision
        Double val2=0.2;
        System.out.println(val2);
        System.out.printf("%.2f",val2);
        //controlling the precision using the string fromat
        String format1=String.format("%4f",val2);
        System.out.println(format1);
        
        //Arrays
        

    }
}
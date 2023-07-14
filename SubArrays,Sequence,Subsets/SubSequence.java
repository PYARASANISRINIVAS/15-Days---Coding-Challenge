import java.util.*;
public class SubSequence {
    public static ArrayList<String> SubSequenceGen(String str){
        if(str.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(" ");
            return list;
        }
        char ele=str.charAt(0);
        ArrayList<String> gen=SubSequenceGen(str.substring(1));
        ArrayList<String> newGen=new ArrayList<>();
        for(String x:gen){
            newGen.add(""+x);
            newGen.add(ele+x);
        }

            return newGen;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String> list=SubSequenceGen(str);

        for(String x: list){
            System.out.println(x);
        }
        System.out.println(list.size());
    }
}


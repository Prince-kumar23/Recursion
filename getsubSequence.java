import java.util.*;
class getsubSequence{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        ArrayList<String> list=gss(str,0);
        System.out.print(list);
    }
    public static ArrayList<String> gss(String str,int idx){
        if(idx==str.length()){
            ArrayList<String> base=new ArrayList<>();
            base.add("");
             return base;
        }

        ArrayList<String> recAns=gss(str,idx+1);
        ArrayList<String> myAns=new ArrayList<>(recAns);
        for(String s:recAns){
            myAns.add(str.charAt(idx)+s);
        }

        return myAns;
    }
}
import java.util.*;
class Main {
    public static void main(String[] args){
       String s="pratikshya";
       TreeSet<String> ts=new TreeSet<>();
       char[] ch=s.toCharArray();
       for(char c:ch){
           ts.add(String.valueOf(c));
       }
       System.out.println(ts);
    }
}
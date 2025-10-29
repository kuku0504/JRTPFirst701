import java.util.*;
class Main {
    public static void main(String[] args){
       String s="pratikshya";
       ArrayList<String> hm=new ArrayList<>();
       char[] ch=s.toCharArray();
       for(char c:ch){
          hm.add(String.valueOf(c));
       }
      
       System.out.println(hm+"");
       /*TreeSet<String> ts=new TreeSet<>(hm);
       System.out.println(ts+"");*/
       Collections.sort(hm);
       System.out.println(hm+"");
    }
}
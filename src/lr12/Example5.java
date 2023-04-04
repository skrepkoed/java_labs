package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example5 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("aaaaaabc");
        list.add("cdcdscdabcjdjjdj");
        list.add("cde");

        list=filterSubString(list,"abc");
        System.out.println(list);
    }
    public static List<String>  filterSubString(List<String> list,String substring) {
       return list.stream().filter(x->x.contains(substring)).collect(Collectors.toList());
    }
}

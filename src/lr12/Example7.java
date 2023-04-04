package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example7 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("abc");
        list.add("bcd");
        list.add("aaaaaabc");
        list.add("cdcdscdabcjdjjdj");
        list.add("cde");

        list=filterStringLength(list,3);
        System.out.println(list);
    }
    public static List<String> filterStringLength(List<String> list,int number) {
        return list.stream().filter(x->x.length()>number).collect(Collectors.toList());
    }
}

package lr12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Example9 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("ab4c");
        list.add("bcd");
        list.add("aa32aaaabc");
        list.add("cdcdscda???bcjdjjdj");
        list.add("cde");

        list=filterStringChars(list);
        System.out.println(list);
    }
    public static List<String> filterStringChars(List<String> list) {
        return list.stream().filter(x->x.matches("^[a-zA-Z]+$")).collect(Collectors.toList());
    }
}

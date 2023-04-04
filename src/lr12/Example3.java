package lr12;

import java.util.List;

import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        String str="Напишите функцию, которая принимает на вход список строк"+
         "и возвращает новый список,"+ 
         " Содержащий только те строки, которые начинаются с большой буквы.";
         List<String> strings=List.of(str.split(" "));
         for (String e : strings) {
            System.out.println(e);
         }
         List<String> stringAfter=filterCapitalizedStrings(strings);
         System.out.println(stringAfter);
    }
    public static List<String> filterCapitalizedStrings(List<String> strings) {
        return strings.stream().filter(x->Character.isUpperCase(x.charAt(0))).collect(Collectors.toList());
    }
}

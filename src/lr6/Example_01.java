package lr6;

public class Example_01 {
    public static void main(String[] args) {
        charAndString obj1= new charAndString();
        obj1.setField('A');
        
        charAndString obj2= new charAndString();
        obj2.setField("String");
        
        charAndString obj3= new charAndString();
        char[] inputString={'A','B','C'};
        obj3.setField(inputString);
        
        charAndString obj4=new charAndString();
        char[] inputChar={'D'};
        obj4.setField(inputChar);

        System.out.println("Field is set to char");
        System.out.println(obj1.getCharField());
        System.out.println(obj1.getStringField());
        
        System.out.println("Field is set to String");
        System.out.println(obj2.getStringField());
        System.out.println(obj2.getCharField());
        
        System.out.println("Field is set to Char array");
        System.out.println(obj3.getStringField());
        System.out.println(obj3.getCharField());

        System.out.println("Field is set to Char array  with one char");
        System.out.println(obj4.getCharField());
        System.out.println(obj4.getStringField());
    }
}
class charAndString {
        
    private  char charField;
    private  String stringField;
    
    public char getCharField() {
        return charField;
    }
    public String getStringField() {
        return stringField;
    }

    public  void setField(char input) {
        charField=input;
    }
    public  void setField(String input) {
        stringField=input;
    }
    public  void setField(char[] input) {
        if (input.length==1) {
            setField(input[0]);
        }else{ 
            setField(String.valueOf(input));
        }
    }
}
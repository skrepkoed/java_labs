package lr7;

public class Example_01 {
    public static void main(String[] args) {
        SubClass obj1= new SubClass("abc");
        System.out.println(obj1.toString());
    }
}

class SuperClass{
    private String textField1;

    public SuperClass() {
    }

    public SuperClass(String textField1) {
        this.textField1 = textField1;
    }

    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName()+" "+"Field1: "+textField1+" ";
    }
}

class SubClass extends SuperClass{
    private String textField2;
    

    public SubClass(String textField1, String textField2) {
        super(textField1);
        this.textField2 = textField2;
    }

    public SubClass(String textField) {
        super();
        this.textField2=textField;
    }
    public String toString(){
        return super.toString()+"Field2: "+this.textField2;
    }
}
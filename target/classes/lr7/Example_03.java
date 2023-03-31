package lr7;

public class Example_03 {
    public static void main(String[] args) {
        A obj1 = new A(1);
        B obj2 = new B(2,'a');
        C obj3 = new C(3,'b',"String");
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
    }
}

class A{
    public int intField;

    public void setField(int intField) {
        this.intField = intField;
    }

    public A(int intField) {
        this.intField = intField;
    }

    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName()+" "+"Field1: "+intField+" ";
    }
}

class B extends A{

    public char charField;
    public void setField(int intField, char charField) {
        super.setField(intField);
        this.charField=charField;
    }

    public B(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    public String toString() {
        return super.toString()+"Field2: "+charField+" ";
    }
}

class C extends B{

    public String stringField;
    public void setField(String stringField, int intField, char charField) {
        super.setField(intField,charField);
        this.stringField=stringField;
    }

    public C(int intField, char charField, String stringField) {
        super(intField, charField);
        this.stringField = stringField;
    }

    public String toString() {
        return super.toString()+"Field3: "+stringField+" ";
    } 
}
package lr7;

public class Example_04 {
    public static void main(String[] args) {
        F obj = new F(1,"String",'a');
        F obj1 = new F(obj);
        System.out.println("Copy obj");
        System.out.println(obj.intField+" "+obj.stringField+" "+obj.charField);
        System.out.println(obj1.intField+" "+obj1.stringField+" "+obj1.charField);
    }
}

class D{

    public char charField;

    public D( char charField) {
        this.charField = charField;
    }

    public D(D d){
        charField=d.charField;
    }
}

class E extends D{

    public String stringField;

    public E( char charField, String stringField) {
        super(charField);
        this.stringField = stringField;
    }
    public E(E e){
        super(e);
        stringField=e.stringField;
    }
}

class F extends E{
    public int intField;

    public F(int intField, String stringField, char charField) {
        super(charField, stringField);
        this.intField = intField;
    }

    public F(F f){
        super(f);
        intField=f.intField;
    }
}
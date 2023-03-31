package lr7;

public class Example_05 {
    public static void main(String[] args) {
        G objG = new G("String");
        G objH = new H("String1",1);
        G objI = new I("String2",'a');
        System.out.println(objG.toString());
        System.out.println(objH.toString());
        System.out.println(objI.toString());        
    }
}

class G {
    private String stringField;

    public G(String stringField) {
        this.stringField = stringField;
    }
    public String toString() {
        return "Class Name: "+this.getClass().getSimpleName()+" "+"Field1: "+stringField+" ";
    }   
}

class H extends G {
private int intField;
    public H(String stringField, int intField) {
        super(stringField);
        this.intField = intField;
    }

    public String toString() {
        return super.toString() +" "+"Field2: "+intField+" ";
    }
}

class I extends G {
    private char charField;
    public I(String stringField, char charField) {
        super(stringField);
        this.charField = charField;
    }
    
    public String toString() {
        return super.toString() +" "+"Field2: "+charField+" ";
    }
}

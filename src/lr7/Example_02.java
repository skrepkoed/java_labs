package lr7;

public class Example_02 {
    public static void main(String[] args) {
        SuperClass1 obj1 = new SuperClass1("abc");
        System.out.println(obj1.getTextString());
        System.out.println(obj1.getStringLen());
        SubClass1 obj2 = new SubClass1("cde",1);
        System.out.println(obj2.getTextString());
        System.out.println(obj2.getIntField());
        obj2.setFields(0, null);
        System.out.println(obj2.getTextString());
        System.out.println(obj2.getIntField());
        obj2.setIntField(5);
        System.out.println(obj2.getIntField());
        obj2.setTextString("Some text");
        System.out.println(obj2.getTextString());
        obj2.setNothing();
        System.out.println(obj2.getTextString());
        System.out.println(obj2.getIntField());
    }
}

class SuperClass1{
    private String textString;
    private int stringLen;
    public SuperClass1(String textString) {
        this.textString = textString;
    }
    public void setTextString(String textString) {
        this.textString = textString;
    }

    public void setTextString() {
        this.textString ="String";
    }

    public int getStringLen() {
        stringLen=countString();
        return stringLen;
    }

    public int countString(){
        return textString.length();
    }
    public String getTextString() {
        return textString;
    }
}

class SubClass1 extends SuperClass1{
    public int intField;

    public SubClass1(String textString, int intField) {
        super(textString);
        this.intField = intField;
    }

    public void setFields(int intField, String textString) {
        super.setTextString(textString);
        this.intField = intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public void setNothing(){
        super.setTextString("Nothing");
        this.intField = 0;
    }

    public int getIntField() {
        return intField;
    }  
}
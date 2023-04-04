package lr11;

public class TailIncrementExample {
    public static void main(String[] args) {
        Node head=null;
        Node tail=null;
        for(int i=0;i<=9;i++){
            Node newNode = new Node(i, null);
            if (head==null&&tail==null) {
                head=newNode;
                tail=newNode;
            }else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        Node ref=head;
        while (ref!=null) {
            System.out.println(ref.value);
            ref=ref.next;
        }
       
    }
}

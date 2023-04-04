package lr11;

public class LinkedListImplExample {
    public static void main(String[] args) {
        Integer[]array={1, 2, 3, 4, 5};
        LinkedList<Integer> linkedlistRec=new LinkedList<Integer>().createHeadRec(array);
        LinkedList<Integer> linkedlistRec1=new LinkedList<Integer>().createTailRec(array);
        linkedlistRec.addFirst(6);
        linkedlistRec.addLast(0);
        linkedlistRec1.addFirst(0);
        linkedlistRec1.addLast(6);
        linkedlistRec.insert(0, 2);
        linkedlistRec1.insert(0, 2);
        System.out.println(linkedlistRec1.toStringRec());
        System.out.println(linkedlistRec.toStringRec());
        linkedlistRec.remove(2);
        linkedlistRec.removeFirst();
        linkedlistRec.removeLast();
        linkedlistRec1.remove(2);
        linkedlistRec1.removeFirst();
        linkedlistRec1.removeLast();
        System.out.println(linkedlistRec1.toStringRec());
        System.out.println(linkedlistRec.toStringRec());

        LinkedList<Integer> linkedlist=new LinkedList<Integer>().createHead(array);
        LinkedList<Integer> linkedlist1=new LinkedList<Integer>().createTail(array);
        linkedlist.addFirst(6);
        linkedlist.addLast(0);
        linkedlist1.addFirst(0);
        linkedlist1.addLast(6);
        linkedlist.insert(0, 2);
        linkedlist1.insert(0, 2);
        System.out.println(linkedlist.toString());
        System.out.println(linkedlist1.toString());
        linkedlist.remove(2);
        linkedlist.removeFirst();
        linkedlist.removeLast();
        linkedlist1.remove(2);
        linkedlist1.removeFirst();
        linkedlist1.removeLast();
        System.out.println(linkedlist.toString());
        System.out.println(linkedlist1.toString());
    }  
}
class LinkedList<T>{
    Node<T> head;
    Node<T> tail;
    Node<T> ref;
    public LinkedList<T> createHead(T[] value) {
        for (T t : value) {
            if (head==null) {
                head=new Node<T>(t, head);
                tail=head;
            }else{
                head=new Node<T>(t, head);
            }
        }
        return this;
    }
    public LinkedList<T> createTail(T[] value) {
        for (T t : value) {
            if (ref==null) {
                ref=new Node<T>(t, null);
                head=ref;
            }else{
                ref.next=new Node<T>(t, null);
                ref=ref.next;
            }
        }
        tail=ref;
        return this;
    }
    public String toString() {
        String result="";
        ref=head;
        while (ref!=null) {
            result+=ref.value+" ";
            ref=ref.next;
        }
        return result;
    }
    public String  toStringRec(Node<T> start) {
        String result="";
        if (start!=null) {
            result+=start.value+" ";
            result+=toStringRec(start.next);
        }
        return result;
    }
    public String  toStringRec() {
        return toStringRec(head);
    }
    public LinkedList<T> addFirst(T value) {
        head= new Node<T>(value,head);
        return this;
    }
    public T addFirstRec(T value) {
        if (head==null) {
            head= new Node<T>(value,head);
            tail=head;
        }else{
            head= new Node<T>(value,head);
        }
        
        
        return value;
    }
    public LinkedList<T> addLast(T value) {
        tail.next= new Node<T>(value,null);
        return this;
    }
    public T addLastRec(T value) {
        if (tail==null) {
            tail=new Node<T>(value,null);
            head=tail;
        }else{
            tail.next= new Node<T>(value,null);
            tail=tail.next;
        }
        return value;
    }
    public LinkedList<T> insert(T value,int position) {
        for(int i=0;i<position;i++){
            ref=head.next;
        }
        if (position==0||position==1) {
            ref=head;
        }
        if (position==0) {
            head=new Node<T>(value, ref);
        }else{
            ref.next=new Node<T>(value, ref.next);
        }
        return this;
    }
    public Node<T> removeFirst() {
        ref=head;
        head=ref.next;
        ref.next=null;
        return ref;
    }
    public Node<T> removeLast() {
        ref=head;
        while (ref.next.next!=null) {
            ref=ref.next;
        }
        Node<T> result=ref.next;
        ref.next=null;
        tail=ref;
        return result;
    }
    public Node<T> remove(int position) {
        Node<T> result;
        for(int i=0;i<position-1;i++){
            ref=head.next;
        }
        if (position==0||position==1) {
            ref=head;
        }
        if (position==0) {
            head=ref.next;
            ref.next=null;
            result=ref;
        }else{
            result=ref.next;
            ref.next=result.next;
            result.next=null;
        }
        return result;
    }
    public LinkedList<T> createHeadRec(T[] array) {
        ArrayRecursion.getArrayRecursion(array, x->addFirstRec(x));   
        return this;
    }
    public LinkedList<T> createTailRec(T[] array) {
        ArrayRecursion.getArrayRecursion(array, x->addLastRec(x));   
        return this;
    }
}

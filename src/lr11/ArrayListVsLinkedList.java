package lr11;

import java.util.ArrayList;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist=new ArrayList<Integer>();
        for(int i=0;i<1000000;i++){
            arraylist.add(i);
        }
        Node head=null;
        for(int i=1000000;i>=0;i--){
            head=new Node(i, head);
        }
       
        long start=System.currentTimeMillis();
        while(arraylist.size()!=1){
            removeEachSecondInArrayList(arraylist);
        }
        long end=System.currentTimeMillis();
        long array_result=end-start;
        start=System.currentTimeMillis();
        while(head.next!=null){
        removeEachSecondInLinkedList(head);
        }
        end=System.currentTimeMillis();
        long linked_list_result=end-start;
        System.out.println("Array result: "+array_result);
        System.out.println("Linked List result: "+linked_list_result);
        
    }

    public static ArrayList<Integer> removeEachSecondInArrayList(ArrayList<Integer> array) {
        for(int i=0;i<array.size();i+=2){
            array.remove(i);
        }
        return array;
    }

    public static Node removeEachSecondInLinkedList(Node head) {
        Node first_node=head;
        Node ref=head;
        Node new_second=null;
        while (ref!=null) {
            Node each_second=ref.next;
            if(each_second!=null){
                new_second=each_second.next;
                ref.next=new_second;
                each_second.next=null; 
            }else{
                new_second=null;
            }
            
            ref=new_second;
        }
        return first_node;
    }
}
